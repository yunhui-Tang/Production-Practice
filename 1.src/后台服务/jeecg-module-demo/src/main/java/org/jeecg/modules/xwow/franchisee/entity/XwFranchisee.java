package org.jeecg.modules.xwow.franchisee.entity;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.math.BigDecimal;
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
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Description: 加盟商
 * @Author: jeecg-boot
 * @Date:   2022-09-26
 * @Version: V1.0
 */
@Data
@TableName("xw_franchisee")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="xw_franchisee对象", description="加盟商")
public class XwFranchisee implements Serializable {
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
	/**加盟商名称*/
	@Excel(name = "加盟商名称", width = 15)
    @ApiModelProperty(value = "加盟商名称")
    private String name;
	/**加盟商图片*/
	@Excel(name = "加盟商图片", width = 15)
    @ApiModelProperty(value = "加盟商图片")
    private String image;
	/**加盟商描述*/
	@Excel(name = "加盟商描述", width = 15)
    @ApiModelProperty(value = "加盟商描述")
    private String descr;
}
