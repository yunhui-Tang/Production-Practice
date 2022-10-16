package org.jeecg.modules.xwow.waterstation.service;

import org.jeecg.modules.xwow.waterstation.entity.XwWaterStationMonthly;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * @Description: 水站月报
 * @Author: jeecg-boot
 * @Date:   2022-09-24
 * @Version: V1.0
 */
public interface IXwWaterStationMonthlyService extends IService<XwWaterStationMonthly> {

	/**
	 * 通过主表id查询子表数据
	 *
	 * @param mainId 主表id
	 * @return List<XwWaterStationMonthly>
	 */
	public List<XwWaterStationMonthly> selectByMainId(String mainId);
}
