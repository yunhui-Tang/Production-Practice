package org.jeecg.modules.xwow.user.vo;

import java.util.List;
import org.jeecg.modules.xwow.user.entity.XwUser;
import org.jeecg.modules.xwow.user.entity.XwOrder;
import org.jeecg.modules.xwow.user.entity.XwCar;
import lombok.Data;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelEntity;
import org.jeecgframework.poi.excel.annotation.ExcelCollection;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import org.jeecg.common.aspect.annotation.Dict;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description: 用户
 * @Author: jeecg-boot
 * @Date:   2022-09-23
 * @Version: V1.0
 */
@Data
@ApiModel(value="xw_userPage对象", description="用户")
public class XwUserPage {

	/**主键*/
	@ApiModelProperty(value = "主键")
    private String id;
	/**创建人*/
	@ApiModelProperty(value = "创建人")
    private String createBy;
	/**创建日期*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "创建日期")
    private Date createTime;
	/**更新人*/
	@ApiModelProperty(value = "更新人")
    private String updateBy;
	/**更新日期*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "更新日期")
    private Date updateTime;
	/**所属部门*/
	@ApiModelProperty(value = "所属部门")
    private String sysOrgCode;
	/**用户名*/
	@Excel(name = "用户名", width = 15)
	@ApiModelProperty(value = "用户名")
    private String name;
	/**密码*/
	@Excel(name = "密码", width = 15)
	@ApiModelProperty(value = "密码")
    private String password;
	/**手机号码*/
	@Excel(name = "手机号码", width = 15)
	@ApiModelProperty(value = "手机号码")
    private String phoneNumber;
	/**头像*/
	@Excel(name = "头像", width = 15)
	@ApiModelProperty(value = "头像")
    private String avatar;
	/**昵称*/
	@Excel(name = "昵称", width = 15)
	@ApiModelProperty(value = "昵称")
    private String nickName;
	/**性别*/
	@Excel(name = "性别", width = 15, dicCode = "sex")
    @Dict(dicCode = "sex")
	@ApiModelProperty(value = "性别")
    private String sex;
	/**我的水票*/
	@Excel(name = "我的水票", width = 15)
	@ApiModelProperty(value = "我的水票")
    private String waterTicketId;
	/**收货地址*/
	@Excel(name = "收货地址", width = 15)
	@ApiModelProperty(value = "收货地址")
    private String receiptAddress;
	/**是否是会员*/
	@Excel(name = "是否是会员", width = 15)
	@ApiModelProperty(value = "是否是会员")
    private Integer isMember;
	/**是否是新用户*/
	@Excel(name = "是否是新用户", width = 15)
	@ApiModelProperty(value = "是否是新用户")
    private Integer isNew;
	/**用户标签*/
	@Excel(name = "用户标签", width = 15)
	@ApiModelProperty(value = "用户标签")
    private String userLabel;
	/**用户积分*/
	@Excel(name = "用户积分", width = 15)
	@ApiModelProperty(value = "用户积分")
    private Integer integration;

	@ExcelCollection(name="订单")
	@ApiModelProperty(value = "订单")
	private List<XwOrder> xwOrderList;
	@ExcelCollection(name="购物车")
	@ApiModelProperty(value = "购物车")
	private List<XwCar> xwCarList;

}
