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
 * @Description: ??????
 * @Author: jeecg-boot
 * @Date:   2022-09-24
 * @Version: V1.0
 */
@Api(tags="??????")
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
	 * ??????????????????
	 *
	 * @param xwWaterStation
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	//@AutoLog(value = "??????-??????????????????")
	@ApiOperation(value="??????-??????????????????", notes="??????-??????????????????")
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
	 *   ??????
	 *
	 * @param xwWaterStationPage
	 * @return
	 */
	@AutoLog(value = "??????-??????")
	@ApiOperation(value="??????-??????", notes="??????-??????")
	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody XwWaterStationPage xwWaterStationPage) {
		XwWaterStation xwWaterStation = new XwWaterStation();
		BeanUtils.copyProperties(xwWaterStationPage, xwWaterStation);
		xwWaterStationService.saveMain(xwWaterStation, xwWaterStationPage.getXwWaterStationWeeklyList(),xwWaterStationPage.getXwWaterStationMonthlyList(),xwWaterStationPage.getXwDeliveryerList(),xwWaterStationPage.getXwWaterStationGoodList());
		return Result.OK("???????????????");
	}
	
	/**
	 *  ??????
	 *
	 * @param xwWaterStationPage
	 * @return
	 */
	@AutoLog(value = "??????-??????")
	@ApiOperation(value="??????-??????", notes="??????-??????")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<String> edit(@RequestBody XwWaterStationPage xwWaterStationPage) {
		XwWaterStation xwWaterStation = new XwWaterStation();
		BeanUtils.copyProperties(xwWaterStationPage, xwWaterStation);
		XwWaterStation xwWaterStationEntity = xwWaterStationService.getById(xwWaterStation.getId());
		if(xwWaterStationEntity==null) {
			return Result.error("?????????????????????");
		}
		xwWaterStationService.updateMain(xwWaterStation, xwWaterStationPage.getXwWaterStationWeeklyList(),xwWaterStationPage.getXwWaterStationMonthlyList(),xwWaterStationPage.getXwDeliveryerList(),xwWaterStationPage.getXwWaterStationGoodList());
		return Result.OK("????????????!");
	}
	
	/**
	 *   ??????id??????
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "??????-??????id??????")
	@ApiOperation(value="??????-??????id??????", notes="??????-??????id??????")
	@DeleteMapping(value = "/delete")
	public Result<String> delete(@RequestParam(name="id",required=true) String id) {
		xwWaterStationService.delMain(id);
		return Result.OK("????????????!");
	}
	
	/**
	 *  ????????????
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "??????-????????????")
	@ApiOperation(value="??????-????????????", notes="??????-????????????")
	@DeleteMapping(value = "/deleteBatch")
	public Result<String> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.xwWaterStationService.delBatchMain(Arrays.asList(ids.split(",")));
		return Result.OK("?????????????????????");
	}
	
	/**
	 * ??????id??????
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "??????-??????id??????")
	@ApiOperation(value="??????-??????id??????", notes="??????-??????id??????")
	@GetMapping(value = "/queryById")
	public Result<XwWaterStation> queryById(@RequestParam(name="id",required=true) String id) {
		XwWaterStation xwWaterStation = xwWaterStationService.getById(id);
		if(xwWaterStation==null) {
			return Result.error("?????????????????????");
		}
		return Result.OK(xwWaterStation);

	}
	
	/**
	 * ??????id??????
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "????????????????????????ID??????")
	@ApiOperation(value="??????????????????ID??????", notes="????????????-?????????ID??????")
	@GetMapping(value = "/queryXwWaterStationWeeklyByMainId")
	public Result<List<XwWaterStationWeekly>> queryXwWaterStationWeeklyListByMainId(@RequestParam(name="id",required=true) String id) {
		List<XwWaterStationWeekly> xwWaterStationWeeklyList = xwWaterStationWeeklyService.selectByMainId(id);
		return Result.OK(xwWaterStationWeeklyList);
	}
	/**
	 * ??????id??????
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "????????????????????????ID??????")
	@ApiOperation(value="??????????????????ID??????", notes="????????????-?????????ID??????")
	@GetMapping(value = "/queryXwWaterStationMonthlyByMainId")
	public Result<List<XwWaterStationMonthly>> queryXwWaterStationMonthlyListByMainId(@RequestParam(name="id",required=true) String id) {
		List<XwWaterStationMonthly> xwWaterStationMonthlyList = xwWaterStationMonthlyService.selectByMainId(id);
		return Result.OK(xwWaterStationMonthlyList);
	}
	/**
	 * ??????id??????
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "?????????????????????ID??????")
	@ApiOperation(value="???????????????ID??????", notes="?????????-?????????ID??????")
	@GetMapping(value = "/queryXwDeliveryerByMainId")
	public Result<List<XwDeliveryer>> queryXwDeliveryerListByMainId(@RequestParam(name="id",required=true) String id) {
		List<XwDeliveryer> xwDeliveryerList = xwDeliveryerService.selectByMainId(id);
		return Result.OK(xwDeliveryerList);
	}
	/**
	 * ??????id??????
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "?????????????????????????????????ID??????")
	@ApiOperation(value="???????????????????????????ID??????", notes="?????????????????????-?????????ID??????")
	@GetMapping(value = "/queryXwWaterStationGoodByMainId")
	public Result<List<XwWaterStationGood>> queryXwWaterStationGoodListByMainId(@RequestParam(name="id",required=true) String id) {
		List<XwWaterStationGood> xwWaterStationGoodList = xwWaterStationGoodService.selectByMainId(id);
		return Result.OK(xwWaterStationGoodList);
	}

    /**
    * ??????excel
    *
    * @param request
    * @param xwWaterStation
    */
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, XwWaterStation xwWaterStation) {
      // Step.1 ??????????????????????????????
      QueryWrapper<XwWaterStation> queryWrapper = QueryGenerator.initQueryWrapper(xwWaterStation, request.getParameterMap());
      LoginUser sysUser = (LoginUser) SecurityUtils.getSubject().getPrincipal();

      //??????????????????????????????
      String selections = request.getParameter("selections");
      if(oConvertUtils.isNotEmpty(selections)) {
         List<String> selectionList = Arrays.asList(selections.split(","));
         queryWrapper.in("id",selectionList);
      }
      //Step.2 ??????????????????
      List<XwWaterStation> xwWaterStationList = xwWaterStationService.list(queryWrapper);

      // Step.3 ??????pageList
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

      // Step.4 AutoPoi ??????Excel
      ModelAndView mv = new ModelAndView(new JeecgEntityExcelView());
      mv.addObject(NormalExcelConstants.FILE_NAME, "????????????");
      mv.addObject(NormalExcelConstants.CLASS, XwWaterStationPage.class);
      mv.addObject(NormalExcelConstants.PARAMS, new ExportParams("????????????", "?????????:"+sysUser.getRealname(), "??????"));
      mv.addObject(NormalExcelConstants.DATA_LIST, pageList);
      return mv;
    }

    /**
    * ??????excel????????????
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
          // ????????????????????????
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
              return Result.OK("?????????????????????????????????:" + list.size());
          } catch (Exception e) {
              log.error(e.getMessage(),e);
              return Result.error("??????????????????:"+e.getMessage());
          } finally {
              try {
                  file.getInputStream().close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
      }
      return Result.OK("?????????????????????");
    }

}
