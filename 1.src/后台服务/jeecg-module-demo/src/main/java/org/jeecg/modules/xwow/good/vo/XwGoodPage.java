package org.jeecg.modules.xwow.good.vo;

import java.util.List;
import org.jeecg.modules.xwow.good.entity.XwGood;
import org.jeecg.modules.xwow.good.entity.XwGoodAppraise;
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
 * @Description: 商品
 * @Author: jeecg-boot
 * @Date:   2022-09-28
 * @Version: V1.0
 */
@Data
@ApiModel(value="xw_goodPage对象", description="商品")
public class XwGoodPage {

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
	/**商品图片*/
	@Excel(name = "商品图片", width = 15)
	@ApiModelProperty(value = "商品图片")
    private String image;
	/**商品名称*/
	@Excel(name = "商品名称", width = 15)
	@ApiModelProperty(value = "商品名称")
    private String name;
	/**是否在售*/
	@Excel(name = "是否在售", width = 15, dicCode = "yn")
    @Dict(dicCode = "yn")
	@ApiModelProperty(value = "是否在售")
    private Integer isOnSale;
	/**库存*/
	@Excel(name = "库存", width = 15)
	@ApiModelProperty(value = "库存")
    private Integer goodStock;
	/**销售量*/
	@Excel(name = "销售量", width = 15)
	@ApiModelProperty(value = "销售量")
    private Integer sellVolume;
	/**零售价格*/
	@Excel(name = "零售价格", width = 15)
	@ApiModelProperty(value = "零售价格")
    private Double retailPrice;
	/**商品简介*/
	@Excel(name = "商品简介", width = 15)
	@ApiModelProperty(value = "商品简介")
    private String goodBrief;
	/**商品评价*/
	@Excel(name = "商品评价", width = 15)
	@ApiModelProperty(value = "商品评价")
    private String goodDesc;
	/**商品单位*/
	@Excel(name = "商品单位", width = 15)
	@ApiModelProperty(value = "商品单位")
    private String goodUnit;
	/**图片url地址*/
	@Excel(name = "图片url地址", width = 15)
	@ApiModelProperty(value = "图片url地址")
    private String pictureUrl;
	/**是否下架*/
	@Excel(name = "是否下架", width = 15, dicCode = "yn")
    @Dict(dicCode = "yn")
	@ApiModelProperty(value = "是否下架")
    private Integer isDelete;
	/**标签*/
	@Excel(name = "标签", width = 15)
	@ApiModelProperty(value = "标签")
    private String goodLabel;
	/**商品类型*/
	@Excel(name = "商品类型", width = 15)
	@ApiModelProperty(value = "商品类型")
    private String goodType;

	@ExcelCollection(name="商品评价")
	@ApiModelProperty(value = "商品评价")
	private List<XwGoodAppraise> xwGoodAppraiseList;

}
