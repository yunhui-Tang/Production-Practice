package org.jeecg.modules.xwow.waterstation.service;

import org.jeecg.modules.xwow.waterstation.entity.XwWaterStationWeekly;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * @Description: 水站周报
 * @Author: jeecg-boot
 * @Date:   2022-09-24
 * @Version: V1.0
 */
public interface IXwWaterStationWeeklyService extends IService<XwWaterStationWeekly> {

	/**
	 * 通过主表id查询子表数据
	 *
	 * @param mainId 主表id
	 * @return List<XwWaterStationWeekly>
	 */
	public List<XwWaterStationWeekly> selectByMainId(String mainId);
}
