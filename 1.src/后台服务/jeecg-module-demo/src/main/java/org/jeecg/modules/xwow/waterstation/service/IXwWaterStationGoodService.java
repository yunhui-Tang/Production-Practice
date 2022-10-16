package org.jeecg.modules.xwow.waterstation.service;

import org.jeecg.modules.xwow.waterstation.entity.XwWaterStationGood;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * @Description: 水站商品中间表
 * @Author: jeecg-boot
 * @Date:   2022-09-24
 * @Version: V1.0
 */
public interface IXwWaterStationGoodService extends IService<XwWaterStationGood> {

	/**
	 * 通过主表id查询子表数据
	 *
	 * @param mainId 主表id
	 * @return List<XwWaterStationGood>
	 */
	public List<XwWaterStationGood> selectByMainId(String mainId);
}
