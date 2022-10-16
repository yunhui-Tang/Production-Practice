package org.jeecg.modules.xwow.waterstation.vo;

import java.util.List;
import org.jeecg.modules.xwow.waterstation.entity.XwWaterStation;
import org.jeecg.modules.xwow.waterstation.entity.XwWaterStationWeekly;
import org.jeecg.modules.xwow.waterstation.entity.XwWaterStationMonthly;
import org.jeecg.modules.xwow.waterstation.entity.XwDeliveryer;
import org.jeecg.modules.xwow.waterstation.entity.XwWaterStationGood;
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
 * @Description: 水站
 * @Author: jeecg-boot
 * @Date:   2022-09-24
 * @Version: V1.0
 */
@Data
@ApiModel(value="xw_water_stationPage对象", description="水站")
public class XwWaterStationPage {

	/**id*/
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

	@ExcelCollection(name="水站周报")
	@ApiModelProperty(value = "水站周报")
	private List<XwWaterStationWeekly> xwWaterStationWeeklyList;
	@ExcelCollection(name="水站月报")
	@ApiModelProperty(value = "水站月报")
	private List<XwWaterStationMonthly> xwWaterStationMonthlyList;
	@ExcelCollection(name="送水工")
	@ApiModelProperty(value = "送水工")
	private List<XwDeliveryer> xwDeliveryerList;
	@ExcelCollection(name="水站商品中间表")
	@ApiModelProperty(value = "水站商品中间表")
	private List<XwWaterStationGood> xwWaterStationGoodList;

}
