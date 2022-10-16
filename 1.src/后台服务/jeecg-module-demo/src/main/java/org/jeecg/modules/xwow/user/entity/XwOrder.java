package org.jeecg.modules.xwow.user.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.UnsupportedEncodingException;

/**
 * @Description: 订单
 * @Author: jeecg-boot
 * @Date:   2022-09-23
 * @Version: V1.0
 */
@ApiModel(value="xw_order对象", description="订单")
@Data
@TableName("xw_order")
public class XwOrder implements Serializable {
    private static final long serialVersionUID = 1L;

	/**主键*/
	@TableId(type = IdType.ASSIGN_ID)
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
	/**订单编号*/
	@Excel(name = "订单编号", width = 15)
    @ApiModelProperty(value = "订单编号")
    private String orderSn;
	/**订单总金额*/
	@Excel(name = "订单总金额", width = 15)
    @ApiModelProperty(value = "订单总金额")
    private Double totalAmount;
	/**实际支付金额*/
	@Excel(name = "实际支付金额", width = 15)
    @ApiModelProperty(value = "实际支付金额")
    private Double payAmount;
	/**运费金额*/
	@Excel(name = "运费金额", width = 15)
    @ApiModelProperty(value = "运费金额")
    private Double freightAmount;
	/**积分抵扣金额*/
	@Excel(name = "积分抵扣金额", width = 15)
    @ApiModelProperty(value = "积分抵扣金额")
    private Double integrationAmount;
	/**优惠券抵扣金额*/
	@Excel(name = "优惠券抵扣金额", width = 15)
    @ApiModelProperty(value = "优惠券抵扣金额")
    private Double couponAmount;
	/**订单状态*/
	@Excel(name = "订单状态", width = 15, dicCode = "order_status")
    @ApiModelProperty(value = "订单状态")
    private Integer status;
	/**配送公司*/
	@Excel(name = "配送公司", width = 15)
    @ApiModelProperty(value = "配送公司")
    private String deliveryCompany;
	/**物流单号*/
	@Excel(name = "物流单号", width = 15)
    @ApiModelProperty(value = "物流单号")
    private String deliverySn;
	/**可以获得的积分*/
	@Excel(name = "可以获得的积分", width = 15)
    @ApiModelProperty(value = "可以获得的积分")
    private Integer integration;
	/**收货人姓名*/
	@Excel(name = "收货人姓名", width = 15)
    @ApiModelProperty(value = "收货人姓名")
    private String receiverName;
	/**收货人电话*/
	@Excel(name = "收货人电话", width = 15)
    @ApiModelProperty(value = "收货人电话")
    private String receiverPhone;
	/**详细地址*/
	@Excel(name = "详细地址", width = 15)
    @ApiModelProperty(value = "详细地址")
    private String receiverDetailAddress;
	/**订单备注*/
	@Excel(name = "订单备注", width = 15)
    @ApiModelProperty(value = "订单备注")
    private String note;
	/**确认收货状态*/
	@Excel(name = "确认收货状态", width = 15, dicCode = "order_confirm_status")
    @ApiModelProperty(value = "确认收货状态")
    private Integer confirmStatus;
	/**删除状态*/
	@Excel(name = "删除状态", width = 15, dicCode = "delete_status")
    @ApiModelProperty(value = "删除状态")
    private Integer deleteStatus;
	/**下单时使用的积分*/
	@Excel(name = "下单时使用的积分", width = 15)
    @ApiModelProperty(value = "下单时使用的积分")
    private Integer useIntegration;
	/**支付时间*/
	@Excel(name = "支付时间", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "支付时间")
    private Date paymentTime;
	/**发货时间*/
	@Excel(name = "发货时间", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "发货时间")
    private Date deliveryTime;
	/**确认收货时间*/
	@Excel(name = "确认收货时间", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "确认收货时间")
    private Date receiveTime;
	/**评价时间*/
	@Excel(name = "评价时间", width = 15, format = "yyyy-MM-dd")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "评价时间")
    private Date commentTime;
	/**用户id*/
    @ApiModelProperty(value = "用户id")
    private String userId;
}
