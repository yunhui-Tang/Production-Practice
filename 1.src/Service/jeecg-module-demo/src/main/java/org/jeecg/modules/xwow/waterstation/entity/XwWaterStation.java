package org.jeecg.modules.xwow.waterstation.entity;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecg.common.aspect.annotation.Dict;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description: 水站
 * @Author: jeecg-boot
 * @Date:   2022-09-24
 * @Version: V1.0
 */
@ApiModel(value="xw_water_station对象", description="水站")
@Data
@TableName("xw_water_station")
public class XwWaterStation implements Serializable {
    private static final long serialVersionUID = 1L;

	/**id*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "id")
    private String id;
	/**创建人*/
    @ApiModelProperty(value = "创建人")
    private String createBy;
	/**创建日期*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "创建日期")
    private Date createTime;
	/**更新人*/
    @ApiModelProperty(value = "更新人")
    private String updateBy;
	/**更新日期*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "更新日期")
    private Date updateTime;
	/**所属部门*/
    @ApiModelProperty(value = "所属部门")
    private String sysOrgCode;
	/**水站账号*/
	@Excel(name = "水站账号", width = 15)
    @ApiModelProperty(value = "水站账号")
    private String username;
	/**水站密码*/
	@Excel(name = "水站密码", width = 15)
    @ApiModelProperty(value = "水站密码")
    private String password;
	/**水站名称*/
	@Excel(name = "水站名称", width = 15)
    @ApiModelProperty(value = "水站名称")
    private String name;
	/**水站图片*/
	@Excel(name = "水站图片", width = 15)
    @ApiModelProperty(value = "水站图片")
    private String image;
	/**水站描述*/
	@Excel(name = "水站描述", width = 15)
    @ApiModelProperty(value = "水站描述")
    private String descr;
	/**水站地址*/
	@Excel(name = "水站地址", width = 15)
    @ApiModelProperty(value = "水站地址")
    private String address;
	/**加盟或直销*/
	@Excel(name = "加盟或直销", width = 15, dicCode = "join_direct")
    @Dict(dicCode = "join_direct")
    @ApiModelProperty(value = "加盟或直销")
    private Integer joinDirect;
	/**押金*/
	@Excel(name = "押金", width = 15)
    @ApiModelProperty(value = "押金")
    private Double deposit;
	/**分润比例*/
	@Excel(name = "分润比例", width = 15)
    @ApiModelProperty(value = "分润比例")
    private Double profitSharingRatio;
}
