package org.jeecg.modules.xwow.ordergoods.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.common.util.oConvertUtils;
import org.jeecg.modules.xwow.ordergoods.entity.XwOrderGoods;
import org.jeecg.modules.xwow.ordergoods.service.IXwOrderGoodsService;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;

import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.def.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.view.JeecgEntityExcelView;
import org.jeecg.common.system.base.controller.JeecgController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jeecg.common.aspect.annotation.AutoLog;

 /**
 * @Description: 订单商品中间表
 * @Author: jeecg-boot
 * @Date:   2022-09-26
 * @Version: V1.0
 */
@Api(tags="订单商品中间表")
@RestController
@RequestMapping("/ordergoods/xwOrderGoods")
@Slf4j
public class XwOrderGoodsController extends JeecgController<XwOrderGoods, IXwOrderGoodsService> {
	@Autowired
	private IXwOrderGoodsService xwOrderGoodsService;
	
	/**
	 * 分页列表查询
	 *
	 * @param xwOrderGoods
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	//@AutoLog(value = "订单商品中间表-分页列表查询")
	@ApiOperation(value="订单商品中间表-分页列表查询", notes="订单商品中间表-分页列表查询")
	@GetMapping(value = "/list")
	public Result<IPage<XwOrderGoods>> queryPageList(XwOrderGoods xwOrderGoods,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<XwOrderGoods> queryWrapper = QueryGenerator.initQueryWrapper(xwOrderGoods, req.getParameterMap());
		Page<XwOrderGoods> page = new Page<XwOrderGoods>(pageNo, pageSize);
		IPage<XwOrderGoods> pageList = xwOrderGoodsService.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 *   添加
	 *
	 * @param xwOrderGoods
	 * @return
	 */
	@AutoLog(value = "订单商品中间表-添加")
	@ApiOperation(value="订单商品中间表-添加", notes="订单商品中间表-添加")
	//@RequiresPermissions("org.jeecg.modules.xwow:xw_order_goods:add")
	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody XwOrderGoods xwOrderGoods) {
		xwOrderGoodsService.save(xwOrderGoods);
		return Result.OK("添加成功！");
	}
	
	/**
	 *  编辑
	 *
	 * @param xwOrderGoods
	 * @return
	 */
	@AutoLog(value = "订单商品中间表-编辑")
	@ApiOperation(value="订单商品中间表-编辑", notes="订单商品中间表-编辑")
	//@RequiresPermissions("org.jeecg.modules.xwow:xw_order_goods:edit")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<String> edit(@RequestBody XwOrderGoods xwOrderGoods) {
		xwOrderGoodsService.updateById(xwOrderGoods);
		return Result.OK("编辑成功!");
	}
	
	/**
	 *   通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "订单商品中间表-通过id删除")
	@ApiOperation(value="订单商品中间表-通过id删除", notes="订单商品中间表-通过id删除")
	//@RequiresPermissions("org.jeecg.modules.xwow:xw_order_goods:delete")
	@DeleteMapping(value = "/delete")
	public Result<String> delete(@RequestParam(name="id",required=true) String id) {
		xwOrderGoodsService.removeById(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 *  批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "订单商品中间表-批量删除")
	@ApiOperation(value="订单商品中间表-批量删除", notes="订单商品中间表-批量删除")
	//@RequiresPermissions("org.jeecg.modules.xwow:xw_order_goods:deleteBatch")
	@DeleteMapping(value = "/deleteBatch")
	public Result<String> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.xwOrderGoodsService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功!");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "订单商品中间表-通过id查询")
	@ApiOperation(value="订单商品中间表-通过id查询", notes="订单商品中间表-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<XwOrderGoods> queryById(@RequestParam(name="id",required=true) String id) {
		XwOrderGoods xwOrderGoods = xwOrderGoodsService.getById(id);
		if(xwOrderGoods==null) {
			return Result.error("未找到对应数据");
		}
		return Result.OK(xwOrderGoods);
	}

    /**
    * 导出excel
    *
    * @param request
    * @param xwOrderGoods
    */
    //@RequiresPermissions("org.jeecg.modules.xwow:xw_order_goods:exportXls")
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, XwOrderGoods xwOrderGoods) {
        return super.exportXls(request, xwOrderGoods, XwOrderGoods.class, "订单商品中间表");
    }

    /**
      * 通过excel导入数据
    *
    * @param request
    * @param response
    * @return
    */
    //@RequiresPermissions("xw_order_goods:importExcel")
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
        return super.importExcel(request, response, XwOrderGoods.class);
    }

}
