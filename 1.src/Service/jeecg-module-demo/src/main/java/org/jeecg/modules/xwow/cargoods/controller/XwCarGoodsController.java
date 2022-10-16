package org.jeecg.modules.xwow.cargoods.controller;

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
import org.jeecg.modules.xwow.cargoods.entity.XwCarGoods;
import org.jeecg.modules.xwow.cargoods.service.IXwCarGoodsService;

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
 * @Description: 购物车商品中间表
 * @Author: jeecg-boot
 * @Date:   2022-09-26
 * @Version: V1.0
 */
@Api(tags="购物车商品中间表")
@RestController
@RequestMapping("/xwcargoods/xwCarGoods")
@Slf4j
public class XwCarGoodsController extends JeecgController<XwCarGoods, IXwCarGoodsService> {
	@Autowired
	private IXwCarGoodsService xwCarGoodsService;
	
	/**
	 * 分页列表查询
	 *
	 * @param xwCarGoods
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	//@AutoLog(value = "购物车商品中间表-分页列表查询")
	@ApiOperation(value="购物车商品中间表-分页列表查询", notes="购物车商品中间表-分页列表查询")
	@GetMapping(value = "/list")
	public Result<IPage<XwCarGoods>> queryPageList(XwCarGoods xwCarGoods,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<XwCarGoods> queryWrapper = QueryGenerator.initQueryWrapper(xwCarGoods, req.getParameterMap());
		Page<XwCarGoods> page = new Page<XwCarGoods>(pageNo, pageSize);
		IPage<XwCarGoods> pageList = xwCarGoodsService.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 *   添加
	 *
	 * @param xwCarGoods
	 * @return
	 */
	@AutoLog(value = "购物车商品中间表-添加")
	@ApiOperation(value="购物车商品中间表-添加", notes="购物车商品中间表-添加")
	//@RequiresPermissions("org.jeecg.modules.demo:xw_car_goods:add")
	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody XwCarGoods xwCarGoods) {
		xwCarGoodsService.save(xwCarGoods);
		return Result.OK("添加成功！");
	}
	
	/**
	 *  编辑
	 *
	 * @param xwCarGoods
	 * @return
	 */
	@AutoLog(value = "购物车商品中间表-编辑")
	@ApiOperation(value="购物车商品中间表-编辑", notes="购物车商品中间表-编辑")
	//@RequiresPermissions("org.jeecg.modules.demo:xw_car_goods:edit")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<String> edit(@RequestBody XwCarGoods xwCarGoods) {
		xwCarGoodsService.updateById(xwCarGoods);
		return Result.OK("编辑成功!");
	}
	
	/**
	 *   通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "购物车商品中间表-通过id删除")
	@ApiOperation(value="购物车商品中间表-通过id删除", notes="购物车商品中间表-通过id删除")
	//@RequiresPermissions("org.jeecg.modules.demo:xw_car_goods:delete")
	@DeleteMapping(value = "/delete")
	public Result<String> delete(@RequestParam(name="id",required=true) String id) {
		xwCarGoodsService.removeById(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 *  批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "购物车商品中间表-批量删除")
	@ApiOperation(value="购物车商品中间表-批量删除", notes="购物车商品中间表-批量删除")
	//@RequiresPermissions("org.jeecg.modules.demo:xw_car_goods:deleteBatch")
	@DeleteMapping(value = "/deleteBatch")
	public Result<String> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.xwCarGoodsService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功!");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "购物车商品中间表-通过id查询")
	@ApiOperation(value="购物车商品中间表-通过id查询", notes="购物车商品中间表-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<XwCarGoods> queryById(@RequestParam(name="id",required=true) String id) {
		XwCarGoods xwCarGoods = xwCarGoodsService.getById(id);
		if(xwCarGoods==null) {
			return Result.error("未找到对应数据");
		}
		return Result.OK(xwCarGoods);
	}

    /**
    * 导出excel
    *
    * @param request
    * @param xwCarGoods
    */
    //@RequiresPermissions("org.jeecg.modules.demo:xw_car_goods:exportXls")
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, XwCarGoods xwCarGoods) {
        return super.exportXls(request, xwCarGoods, XwCarGoods.class, "购物车商品中间表");
    }

    /**
      * 通过excel导入数据
    *
    * @param request
    * @param response
    * @return
    */
    //@RequiresPermissions("xw_car_goods:importExcel")
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
        return super.importExcel(request, response, XwCarGoods.class);
    }

}
