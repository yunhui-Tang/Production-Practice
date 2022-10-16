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
 * @Description: 购物车
 * @Author: jeecg-boot
 * @Date:   2022-09-23
 * @Version: V1.0
 */
@ApiModel(value="xw_car对象", description="购物车")
@Data
@TableName("xw_car")
public class XwCar implements Serializable {
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
	/**商品总数量*/
	@Excel(name = "商品总数量", width = 15)
    @ApiModelProperty(value = "商品总数量")
    private Integer goodTotalNum;
	/**选择商品数量*/
	@Excel(name = "选择商品数量", width = 15)
    @ApiModelProperty(value = "选择商品数量")
    private Integer selectedGoodNum;
	/**选择商品总价格*/
	@Excel(name = "选择商品总价格", width = 15)
    @ApiModelProperty(value = "选择商品总价格")
    private Double selectedGoodPrice;
	/**用户id*/
    @ApiModelProperty(value = "用户id")
    private String userId;
}
