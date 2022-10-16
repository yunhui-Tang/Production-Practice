package org.jeecg.modules.xwow.user.controller;

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
import org.jeecg.modules.xwow.user.entity.XwOrder;
import org.jeecg.modules.xwow.user.entity.XwCar;
import org.jeecg.modules.xwow.user.entity.XwUser;
import org.jeecg.modules.xwow.user.vo.XwUserPage;
import org.jeecg.modules.xwow.user.service.IXwUserService;
import org.jeecg.modules.xwow.user.service.IXwOrderService;
import org.jeecg.modules.xwow.user.service.IXwCarService;
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
 * @Description: 用户
 * @Author: jeecg-boot
 * @Date:   2022-09-23
 * @Version: V1.0
 */
@Api(tags="用户")
@RestController
@RequestMapping("/user/xwUser")
@Slf4j
public class XwUserController {
	@Autowired
	private IXwUserService xwUserService;
	@Autowired
	private IXwOrderService xwOrderService;
	@Autowired
	private IXwCarService xwCarService;
	
	/**
	 * 分页列表查询
	 *
	 * @param xwUser
	 * @param pageNo
	 * @param pageSize
	 * @param req
	 * @return
	 */
	//@AutoLog(value = "用户-分页列表查询")
	@ApiOperation(value="用户-分页列表查询", notes="用户-分页列表查询")
	@GetMapping(value = "/list")
	public Result<IPage<XwUser>> queryPageList(XwUser xwUser,
								   @RequestParam(name="pageNo", defaultValue="1") Integer pageNo,
								   @RequestParam(name="pageSize", defaultValue="10") Integer pageSize,
								   HttpServletRequest req) {
		QueryWrapper<XwUser> queryWrapper = QueryGenerator.initQueryWrapper(xwUser, req.getParameterMap());
		Page<XwUser> page = new Page<XwUser>(pageNo, pageSize);
		IPage<XwUser> pageList = xwUserService.page(page, queryWrapper);
		return Result.OK(pageList);
	}
	
	/**
	 *   添加
	 *
	 * @param xwUserPage
	 * @return
	 */
	@AutoLog(value = "用户-添加")
	@ApiOperation(value="用户-添加", notes="用户-添加")
	@PostMapping(value = "/add")
	public Result<String> add(@RequestBody XwUserPage xwUserPage) {
		XwUser xwUser = new XwUser();
		BeanUtils.copyProperties(xwUserPage, xwUser);
		xwUserService.saveMain(xwUser, xwUserPage.getXwOrderList(),xwUserPage.getXwCarList());
		return Result.OK("添加成功！");
	}
	
	/**
	 *  编辑
	 *
	 * @param xwUserPage
	 * @return
	 */
	@AutoLog(value = "用户-编辑")
	@ApiOperation(value="用户-编辑", notes="用户-编辑")
	@RequestMapping(value = "/edit", method = {RequestMethod.PUT,RequestMethod.POST})
	public Result<String> edit(@RequestBody XwUserPage xwUserPage) {
		XwUser xwUser = new XwUser();
		BeanUtils.copyProperties(xwUserPage, xwUser);
		XwUser xwUserEntity = xwUserService.getById(xwUser.getId());
		if(xwUserEntity==null) {
			return Result.error("未找到对应数据");
		}
		xwUserService.updateMain(xwUser, xwUserPage.getXwOrderList(),xwUserPage.getXwCarList());
		return Result.OK("编辑成功!");
	}
	
	/**
	 *   通过id删除
	 *
	 * @param id
	 * @return
	 */
	@AutoLog(value = "用户-通过id删除")
	@ApiOperation(value="用户-通过id删除", notes="用户-通过id删除")
	@DeleteMapping(value = "/delete")
	public Result<String> delete(@RequestParam(name="id",required=true) String id) {
		xwUserService.delMain(id);
		return Result.OK("删除成功!");
	}
	
	/**
	 *  批量删除
	 *
	 * @param ids
	 * @return
	 */
	@AutoLog(value = "用户-批量删除")
	@ApiOperation(value="用户-批量删除", notes="用户-批量删除")
	@DeleteMapping(value = "/deleteBatch")
	public Result<String> deleteBatch(@RequestParam(name="ids",required=true) String ids) {
		this.xwUserService.delBatchMain(Arrays.asList(ids.split(",")));
		return Result.OK("批量删除成功！");
	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "用户-通过id查询")
	@ApiOperation(value="用户-通过id查询", notes="用户-通过id查询")
	@GetMapping(value = "/queryById")
	public Result<XwUser> queryById(@RequestParam(name="id",required=true) String id) {
		XwUser xwUser = xwUserService.getById(id);
		if(xwUser==null) {
			return Result.error("未找到对应数据");
		}
		return Result.OK(xwUser);

	}
	
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "订单通过主表ID查询")
	@ApiOperation(value="订单主表ID查询", notes="订单-通主表ID查询")
	@GetMapping(value = "/queryXwOrderByMainId")
	public Result<List<XwOrder>> queryXwOrderListByMainId(@RequestParam(name="id",required=true) String id) {
		List<XwOrder> xwOrderList = xwOrderService.selectByMainId(id);
		return Result.OK(xwOrderList);
	}
	/**
	 * 通过id查询
	 *
	 * @param id
	 * @return
	 */
	//@AutoLog(value = "购物车通过主表ID查询")
	@ApiOperation(value="购物车主表ID查询", notes="购物车-通主表ID查询")
	@GetMapping(value = "/queryXwCarByMainId")
	public Result<List<XwCar>> queryXwCarListByMainId(@RequestParam(name="id",required=true) String id) {
		List<XwCar> xwCarList = xwCarService.selectByMainId(id);
		return Result.OK(xwCarList);
	}

    /**
    * 导出excel
    *
    * @param request
    * @param xwUser
    */
    @RequestMapping(value = "/exportXls")
    public ModelAndView exportXls(HttpServletRequest request, XwUser xwUser) {
      // Step.1 组装查询条件查询数据
      QueryWrapper<XwUser> queryWrapper = QueryGenerator.initQueryWrapper(xwUser, request.getParameterMap());
      LoginUser sysUser = (LoginUser) SecurityUtils.getSubject().getPrincipal();

      //配置选中数据查询条件
      String selections = request.getParameter("selections");
      if(oConvertUtils.isNotEmpty(selections)) {
         List<String> selectionList = Arrays.asList(selections.split(","));
         queryWrapper.in("id",selectionList);
      }
      //Step.2 获取导出数据
      List<XwUser> xwUserList = xwUserService.list(queryWrapper);

      // Step.3 组装pageList
      List<XwUserPage> pageList = new ArrayList<XwUserPage>();
      for (XwUser main : xwUserList) {
          XwUserPage vo = new XwUserPage();
          BeanUtils.copyProperties(main, vo);
          List<XwOrder> xwOrderList = xwOrderService.selectByMainId(main.getId());
          vo.setXwOrderList(xwOrderList);
          List<XwCar> xwCarList = xwCarService.selectByMainId(main.getId());
          vo.setXwCarList(xwCarList);
          pageList.add(vo);
      }

      // Step.4 AutoPoi 导出Excel
      ModelAndView mv = new ModelAndView(new JeecgEntityExcelView());
      mv.addObject(NormalExcelConstants.FILE_NAME, "用户列表");
      mv.addObject(NormalExcelConstants.CLASS, XwUserPage.class);
      mv.addObject(NormalExcelConstants.PARAMS, new ExportParams("用户数据", "导出人:"+sysUser.getRealname(), "用户"));
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
              List<XwUserPage> list = ExcelImportUtil.importExcel(file.getInputStream(), XwUserPage.class, params);
              for (XwUserPage page : list) {
                  XwUser po = new XwUser();
                  BeanUtils.copyProperties(page, po);
                  xwUserService.saveMain(po, page.getXwOrderList(),page.getXwCarList());
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
