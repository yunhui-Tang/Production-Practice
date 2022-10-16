package org.jeecg.modules.xwow.waterstation.entity;

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
 * @Description: 水站月报
 * @Author: jeecg-boot
 * @Date:   2022-09-24
 * @Version: V1.0
 */
@ApiModel(value="xw_water_station_monthly对象", description="水站月报")
@Data
@TableName("xw_water_station_monthly")
public class XwWaterStationMonthly implements Serializable {
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
	/**总营收*/
	@Excel(name = "总营收", width = 15)
    @ApiModelProperty(value = "总营收")
    private Double totalRevenue;
	/**分润金额*/
	@Excel(name = "分润金额", width = 15)
    @ApiModelProperty(value = "分润金额")
    private Double profitDistriAmount;
	/**销售量*/
	@Excel(name = "销售量", width = 15)
    @ApiModelProperty(value = "销售量")
    private Integer sales;
	/**报表时间*/
	@Excel(name = "报表时间", width = 15)
    @ApiModelProperty(value = "报表时间")
    private String reportTime;
	/**月份*/
	@Excel(name = "月份", width = 15)
    @ApiModelProperty(value = "月份")
    private Integer month;
	/**水站id*/
    @ApiModelProperty(value = "水站id")
    private String waterStationId;
}
