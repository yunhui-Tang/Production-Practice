package org.jeecg.modules.xwow.waterstation.controller;

import java.io.UnsupportedEncodingException;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.def.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.view.JeecgEntityExcelView;
import org.jeecg.common.system.vo.LoginUser;
import org.apache.shiro.SecurityUtils;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.query.QueryGenerator;
import org.jeecg.common.util.oConvertUtils;
import org.jeecg.modules.xwow.waterstation.entity.XwWaterStationWeekly;
import org.jeecg.modules.xwow.waterstation.entity.XwWaterStationMonthly;
import org.jeecg.modules.xwow.waterstation.entity.XwDeliveryer;
import org.jeecg.modules.xwow.waterstation.entity.XwWaterStationGood;
import org.jeecg.modules.xwow.waterstation.entity.XwWaterStation;
import org.jeecg.modules.xwow.waterstation.vo.XwWaterStationPage;
import org.jeecg.modules.xwow.waterstation.service.IXwWaterStationService;
import org.jeecg.modules.xwow.waterstation.service.IXwWaterStationWeeklyService;
import org.jeecg.modules.xwow.waterstation.service.IXwWaterStationMonthlyService;
import org.jeecg.modules.xwow.waterstation.service.IXwDeliveryerService;
import org.jeecg.modules.xwow.waterstation.service.IXwWaterStationGoodService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jeecg.common.aspect.annotation.AutoLog;

 /**
 * @Description: 水站
 * @Author: jeecg-boot
 * @Date:   2022-09-24
 * @Version: V1.0
 */
@Api(tags="水站")
@RestController
@RequestMapping("/waterstation/xwWaterStation")
@Slf4j
public class XwWaterStationController {
	@Autowired
	private IXwWaterStationService xwWaterStationService;
	@Autowired
	private IXwWaterStationWeeklyService xwWaterStationWeeklyService;
	@Autowired
	private IXwWaterStationMonthlyService xwWaterStationMonthlyService;
	@Autowired
	private IXwDeliveryerService xwDeliveryerService;
	@Autowired
	private IXwWaterStationGoodService xwWaterStationGoodService;
	
	/**
	 * 分页列表查询
	 *
	 * @param xwWaterStation
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	//@AutoLog(value = "水站-分页列表查询")
	@ApiOperation(value="水站-分页列表查询", notes="水站-分页列表查询")
	@GetMapping(value = "/list")
	public Result<IPage<XwWaterStation>> queryPageList(XwWaterStation xwWaterStation,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<XwWaterStation> queryWrapper = QueryGenerator.initQueryWrapper(xwWaterStation, req.getParameterMap());
		Page<XwWaterStation> page = new Page<XwWaterStation>(pageNo, pageSize);
		IPage<XwWaterStation> pageList = xwWaterStationService.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 *   添加
	 *
	 * @param xwWaterStationPage
	 * @return
	 */
	@AutoLog(value = "水站-添加")
	@ApiOperation(value="水站-添加", notes="水站-添加")
	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody XwWaterStationPage xwWaterStationPage) {
		XwWaterStation xwWaterStation = new XwWaterStation();
		BeanUtils.copyProperties(xwWaterStationPage, xwWaterStation);
		xwWaterStationService.saveMain(xwWaterStation, xwWaterStationPage.getXwWaterStationWeeklyList(),xwWaterStationPage.getXwWaterStationMonthlyList(),xwWaterStationPage.getXwDeliveryerList(),xwWaterStationPage.getXwWaterStationGoodList());
		return Result.OK("添加成功！");
	}
	
	/**
	 *  编辑
	 *
	 * @param xwWaterStationPage
	 * @return
	 */
	@AutoLog(value = "水站-编辑")
	@ApiOperation(value="水站-编辑", notes="水站-编辑")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<String> edit(@RequestBody XwWaterStationPage xwWaterStationPage) {
		XwWaterStation xwWaterStation = new XwWaterStation();
		BeanUtils.copyProperties(xwWaterStationPage, xwWaterStation);
		XwWaterStation xwWaterStationEntity = xwWaterStationService.getById(xwWaterStation.getId());
		if(xwWaterStationEntity==null) {
			return Result.error("未找到对应数据");
		}
		xwWaterStationService.updateMain(xwWaterStation, xwWaterStationPage.getXwWaterStationWeeklyList(),xwWaterStationPage.getXwWaterStationMonthlyList(),xwWaterStationPage.getXwDeliveryerList(),xwWaterStationPage.getXwWaterStationGoodList());
		return Result.OK("编辑成功!");
	}
	
	/**
	 *   通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "水站-通过id删除")
	@ApiOperation(value="水站-通过id删除", notes="水站-通过id删除")
	@DeleteMapping(value = "/delete")
	public Result<String> delete(@RequestParam(name="id",required=true) String id) {
		xwWaterStationService.delMain(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 *  批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "水站-批量删除")
	@ApiOperation(value="水站-批量删除", notes="水站-批量删除")
	@DeleteMapping(value = "/deleteBatch")
	public Result<String> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.xwWaterStationService.delBatchMain(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功！");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "水站-通过id查询")
	@ApiOperation(value="水站-通过id查询", notes="水站-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<XwWaterStation> queryById(@RequestParam(name="id",required=true) String id) {
		XwWaterStation xwWaterStation = xwWaterStationService.getById(id);
		if(xwWaterStation==null) {
			return Result.error("未找到对应数据");
		}
		return Result.OK(xwWaterStation);

	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "水站周报通过主表ID查询")
	@ApiOperation(value="水站周报主表ID查询", notes="水站周报-通主表ID查询")
	@GetMapping(value = "/queryXwWaterStationWeeklyByMainId")
	public Result<List<XwWaterStationWeekly>> queryXwWaterStationWeeklyListByMainId(@RequestParam(name="id",required=true) String id) {
		List<XwWaterStationWeekly> xwWaterStationWeeklyList = xwWaterStationWeeklyService.selectByMainId(id);
		return Result.OK(xwWaterStationWeeklyList);
	}
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "水站月报通过主表ID查询")
	@ApiOperation(value="水站月报主表ID查询", notes="水站月报-通主表ID查询")
	@GetMapping(value = "/queryXwWaterStationMonthlyByMainId")
	public Result<List<XwWaterStationMonthly>> queryXwWaterStationMonthlyListByMainId(@RequestParam(name="id",required=true) String id) {
		List<XwWaterStationMonthly> xwWaterStationMonthlyList = xwWaterStationMonthlyService.selectByMainId(id);
		return Result.OK(xwWaterStationMonthlyList);
	}
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "送水工通过主表ID查询")
	@ApiOperation(value="送水工主表ID查询", notes="送水工-通主表ID查询")
	@GetMapping(value = "/queryXwDeliveryerByMainId")
	public Result<List<XwDeliveryer>> queryXwDeliveryerListByMainId(@RequestParam(name="id",required=true) String id) {
		List<XwDeliveryer> xwDeliveryerList = xwDeliveryerService.selectByMainId(id);
		return Result.OK(xwDeliveryerList);
	}
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "水站商品中间表通过主表ID查询")
	@ApiOperation(value="水站商品中间表主表ID查询", notes="水站商品中间表-通主表ID查询")
	@GetMapping(value = "/queryXwWaterStationGoodByMainId")
	public Result<List<XwWaterStationGood>> queryXwWaterStationGoodListByMainId(@RequestParam(name="id",required=true) String id) {
		List<XwWaterStationGood> xwWaterStationGoodList = xwWaterStationGoodService.selectByMainId(id);
		return Result.OK(xwWaterStationGoodList);
	}

    /**
    * 导出excel
    *
    * @param request
    * @param xwWaterStation
    */
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, XwWaterStation xwWaterStation) {
      // Step.1 组装查询条件查询数据
      QueryWrapper<XwWaterStation> queryWrapper = QueryGenerator.initQueryWrapper(xwWaterStation, request.getParameterMap());
      LoginUser sysUser = (LoginUser) SecurityUtils.getSubject().getPrincipal();

      //配置选中数据查询条件
      String selections = request.getParameter("selections");
      if(oConvertUtils.isNotEmpty(selections)) {
         List<String> selectionList = Arrays.asList(selections.split(","));
         queryWrapper.in("id",selectionList);
      }
      //Step.2 获取导出数据
      List<XwWaterStation> xwWaterStationList = xwWaterStationService.list(queryWrapper);

      // Step.3 组装pageList
      List<XwWaterStationPage> pageList = new ArrayList<XwWaterStationPage>();
      for (XwWaterStation main : xwWaterStationList) {
          XwWaterStationPage vo = new XwWaterStationPage();
          BeanUtils.copyProperties(main, vo);
          List<XwWaterStationWeekly> xwWaterStationWeeklyList = xwWaterStationWeeklyService.selectByMainId(main.getId());
          vo.setXwWaterStationWeeklyList(xwWaterStationWeeklyList);
          List<XwWaterStationMonthly> xwWaterStationMonthlyList = xwWaterStationMonthlyService.selectByMainId(main.getId());
          vo.setXwWaterStationMonthlyList(xwWaterStationMonthlyList);
          List<XwDeliveryer> xwDeliveryerList = xwDeliveryerService.selectByMainId(main.getId());
          vo.setXwDeliveryerList(xwDeliveryerList);
          List<XwWaterStationGood> xwWaterStationGoodList = xwWaterStationGoodService.selectByMainId(main.getId());
          vo.setXwWaterStationGoodList(xwWaterStationGoodList);
          pageList.add(vo);
      }

      // Step.4 AutoPoi 导出Excel
      ModelAndView mv = new ModelAndView(new JeecgEntityExcelView());
      mv.addObject(NormalExcelConstants.FILE_NAME, "水站列表");
      mv.addObject(NormalExcelConstants.CLASS, XwWaterStationPage.class);
      mv.addObject(NormalExcelConstants.PARAMS, new ExportParams("水站数据", "导出人:"+sysUser.getRealname(), "水站"));
      mv.addObject(NormalExcelConstants.DATA_LIST, pageList);
      return mv;
    }

    /**
    * 通过excel导入数据
    *
    * @param request
    * @param response
    * @return
    */
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public Result<?> importExcel(HttpServletRequest request, HttpServletResponse response) {
      MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
      Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
      for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
          // 获取上传文件对象
          MultipartFile file = entity.getValue();
          ImportParams params = new ImportParams();
          params.setTitleRows(2);
          params.setHeadRows(1);
          params.setNeedSave(true);
          try {
              List<XwWaterStationPage> list = ExcelImportUtil.importExcel(file.getInputStream(), XwWaterStationPage.class, params);
              for (XwWaterStationPage page : list) {
                  XwWaterStation po = new XwWaterStation();
                  BeanUtils.copyProperties(page, po);
                  xwWaterStationService.saveMain(po, page.getXwWaterStationWeeklyList(),page.getXwWaterStationMonthlyList(),page.getXwDeliveryerList(),page.getXwWaterStationGoodList());
              }
              return Result.OK("文件导入成功！数据行数:" + list.size());
          } catch (Exception e) {
              log.error(e.getMessage(),e);
              return Result.error("文件导入失败:"+e.getMessage());
          } finally {
              try {
                  file.getInputStream().close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
      }
      return Result.OK("文件导入失败！");
    }

}
