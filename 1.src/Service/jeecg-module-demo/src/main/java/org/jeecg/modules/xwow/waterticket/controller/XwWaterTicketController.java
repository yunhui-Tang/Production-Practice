package org.jeecg.modules.xwow.waterticket.controller;

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
import org.jeecg.modules.xwow.waterticket.entity.XwWaterTicket;
import org.jeecg.modules.xwow.waterticket.service.IXwWaterTicketService;

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
 * @Description: 水票
 * @Author: jeecg-boot
 * @Date:   2022-09-28
 * @Version: V1.0
 */
@Api(tags="水票")
@RestController
@RequestMapping("/waterticket/xwWaterTicket")
@Slf4j
public class XwWaterTicketController extends JeecgController<XwWaterTicket, IXwWaterTicketService> {
	@Autowired
	private IXwWaterTicketService xwWaterTicketService;
	
	/**
	 * 分页列表查询
	 *
	 * @param xwWaterTicket
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	//@AutoLog(value = "水票-分页列表查询")
	@ApiOperation(value="水票-分页列表查询", notes="水票-分页列表查询")
	@GetMapping(value = "/list")
	public Result<IPage<XwWaterTicket>> queryPageList(XwWaterTicket xwWaterTicket,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<XwWaterTicket> queryWrapper = QueryGenerator.initQueryWrapper(xwWaterTicket, req.getParameterMap());
		Page<XwWaterTicket> page = new Page<XwWaterTicket>(pageNo, pageSize);
		IPage<XwWaterTicket> pageList = xwWaterTicketService.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 *   添加
	 *
	 * @param xwWaterTicket
	 * @return
	 */
	@AutoLog(value = "水票-添加")
	@ApiOperation(value="水票-添加", notes="水票-添加")
	//@RequiresPermissions("org.jeecg.modules.xwow:xw_water_ticket:add")
	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody XwWaterTicket xwWaterTicket) {
		xwWaterTicketService.save(xwWaterTicket);
		return Result.OK("添加成功！");
	}
	
	/**
	 *  编辑
	 *
	 * @param xwWaterTicket
	 * @return
	 */
	@AutoLog(value = "水票-编辑")
	@ApiOperation(value="水票-编辑", notes="水票-编辑")
	//@RequiresPermissions("org.jeecg.modules.xwow:xw_water_ticket:edit")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<String> edit(@RequestBody XwWaterTicket xwWaterTicket) {
		xwWaterTicketService.updateById(xwWaterTicket);
		return Result.OK("编辑成功!");
	}
	
	/**
	 *   通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "水票-通过id删除")
	@ApiOperation(value="水票-通过id删除", notes="水票-通过id删除")
	//@RequiresPermissions("org.jeecg.modules.xwow:xw_water_ticket:delete")
	@DeleteMapping(value = "/delete")
	public Result<String> delete(@RequestParam(name="id",required=true) String id) {
		xwWaterTicketService.removeById(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 *  批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "水票-批量删除")
	@ApiOperation(value="水票-批量删除", notes="水票-批量删除")
	//@RequiresPermissions("org.jeecg.modules.xwow:xw_water_ticket:deleteBatch")
	@DeleteMapping(value = "/deleteBatch")
	public Result<String> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.xwWaterTicketService.removeByIds(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功!");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "水票-通过id查询")
	@ApiOperation(value="水票-通过id查询", notes="水票-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<XwWaterTicket> queryById(@RequestParam(name="id",required=true) String id) {
		XwWaterTicket xwWaterTicket = xwWaterTicketService.getById(id);
		if(xwWaterTicket==null) {
			return Result.error("未找到对应数据");
		}
		return Result.OK(xwWaterTicket);
	}

    /**
    * 导出excel
    *
    * @param request
    * @param xwWaterTicket
    */
    //@RequiresPermissions("org.jeecg.modules.xwow:xw_water_ticket:exportXls")
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, XwWaterTicket xwWaterTicket) {
        return super.exportXls(request, xwWaterTicket, XwWaterTicket.class, "水票");
    }

    /**
      * 通过excel导入数据
    *
    * @param request
    * @param response
    * @return
    */
    //@RequiresPermissions("xw_water_ticket:importExcel")
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
        return super.importExcel(request, response, XwWaterTicket.class);
    }

}
