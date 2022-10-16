package org.jeecg.modules.xwow.order.controller;

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
import org.jeecg.modules.xwow.order.entity.XwOrderMain;
import org.jeecg.modules.xwow.order.service.IXwOrderMainService;

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
 * @Description: 订单主表
 * @Author: jeecg-boot
 * @Date:   2022-09-25
 * @Version: V1.0
 */
@Api(tags="订单主表")
@RestController
@RequestMapping("/order/xwOrderMain")
@Slf4j
public class XwOrderMainController extends JeecgController<XwOrderMain, IXwOrderMainService> {
	@Autowired
	private IXwOrderMainService xwOrderMainService;
	
	/**
	 * 分页列表查询
	 *
	 * @param xwOrderMain
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	//@AutoLog(value = "订单主表-分页列表查询")
	@ApiOperation(value="订单主表-分页列表查询", notes="订单主表-分页列表查询")
	@GetMapping(value = "/list")
	public Result<IPage<XwOrderMain>> queryPageList(XwOrderMain xwOrderMain,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<XwOrderMain> queryWrapper = QueryGenerator.initQueryWrapper(xwOrderMain, req.getParameterMap());
		Page<XwOrderMain> page = new Page<XwOrderMain>(pageNo, pageSize);
		IPage<XwOrderMain> pageList = xwOrderMainService.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 *   添加
	 *
	 * @param xwOrderMain
	 * @return
	 */
	@AutoLog(value = "订单主表-添加")
	@ApiOperation(value="订单主表-添加", notes="订单主表-添加")
	//@RequiresPermissions("org.jeecg.modules.xwow:xw_order_main:add")
	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody XwOrderMain xwOrderMain) {
		xwOrderMainService.save(xwOrderMain);
		return Result.OK("添加成功！");
	}
	
	/**
	 *  编辑
	 *
	 * @param xwOrderMain
	 * @return
	 */
	@AutoLog(value = "订单主表-编辑")
	@ApiOperation(value="订单主表-编辑", notes="订单主表-编辑")
	//@RequiresPermissions("org.jeecg.modules.xwow:xw_order_main:edit")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<String> edit(@RequestBody XwOrderMain xwOrderMain) {
		xwOrderMainService.updateById(xwOrderMain);
		return Result.OK("编辑成功!");
	}
	
	/**
	 *   通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "订单主表-通过id删除")
	@ApiOperation(value="订单主表-通过id删除", notes="订单主表-通过id删除")
	//@RequiresPermissions("org.jeecg.modules.xwow:xw_order_main:delete")
	@DeleteMapping(value = "/delete")
	public Result<String> delete(@RequestParam(name="id",required=true) String id) {
		xwOrderMainService.removeById(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 *  批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "订单主表-批量删除")
	@ApiOperation(value="订单主表-批量删除", notes="订单主表-批量删除")
	//@RequiresPermissions("org.jeecg.modules.xwow:xw_order_main:deleteBatch")
	@DeleteMapping(value = "/deleteBatch")
	public Result<String> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.xwOrderMainService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功!");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "订单主表-通过id查询")
	@ApiOperation(value="订单主表-通过id查询", notes="订单主表-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<XwOrderMain> queryById(@RequestParam(name="id",required=true) String id) {
		XwOrderMain xwOrderMain = xwOrderMainService.getById(id);
		if(xwOrderMain==null) {
			return Result.error("未找到对应数据");
		}
		return Result.OK(xwOrderMain);
	}

    /**
    * 导出excel
    *
    * @param request
    * @param xwOrderMain
    */
    //@RequiresPermissions("org.jeecg.modules.xwow:xw_order_main:exportXls")
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, XwOrderMain xwOrderMain) {
        return super.exportXls(request, xwOrderMain, XwOrderMain.class, "订单主表");
    }

    /**
      * 通过excel导入数据
    *
    * @param request
    * @param response
    * @return
    */
    //@RequiresPermissions("xw_order_main:importExcel")
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
        return super.importExcel(request, response, XwOrderMain.class);
    }

}
