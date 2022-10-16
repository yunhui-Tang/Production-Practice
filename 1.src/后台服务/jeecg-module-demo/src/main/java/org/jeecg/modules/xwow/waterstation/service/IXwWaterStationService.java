package org.jeecg.modules.xwow.waterstation.service;

import org.jeecg.modules.xwow.waterstation.entity.XwWaterStationWeekly;
import org.jeecg.modules.xwow.waterstation.entity.XwWaterStationMonthly;
import org.jeecg.modules.xwow.waterstation.entity.XwDeliveryer;
import org.jeecg.modules.xwow.waterstation.entity.XwWaterStationGood;
import org.jeecg.modules.xwow.waterstation.entity.XwWaterStation;
import com.baomidou.mybatisplus.extension.service.IService;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @Description: 水站
 * @Author: jeecg-boot
 * @Date:   2022-09-24
 * @Version: V1.0
 */
public interface IXwWaterStationService extends IService<XwWaterStation> {

	/**
	 * 添加一对多
	 *
	 * @param xwWaterStation
	 * @param xwWaterStationWeeklyList
	 * @param xwWaterStationMonthlyList
	 * @param xwDeliveryerList
	 * @param xwWaterStationGoodList
	 */
	public void saveMain(XwWaterStation xwWaterStation,List<XwWaterStationWeekly> xwWaterStationWeeklyList,List<XwWaterStationMonthly> xwWaterStationMonthlyList,List<XwDeliveryer> xwDeliveryerList,List<XwWaterStationGood> xwWaterStationGoodList) ;
	
	/**
	 * 修改一对多
	 *
   * @param xwWaterStation
   * @param xwWaterStationWeeklyList
   * @param xwWaterStationMonthlyList
   * @param xwDeliveryerList
   * @param xwWaterStationGoodList
	 */
	public void updateMain(XwWaterStation xwWaterStation,List<XwWaterStationWeekly> xwWaterStationWeeklyList,List<XwWaterStationMonthly> xwWaterStationMonthlyList,List<XwDeliveryer> xwDeliveryerList,List<XwWaterStationGood> xwWaterStationGoodList);
	
	/**
	 * 删除一对多
	 *
	 * @param id
	 */
	public void delMain (String id);
	
	/**
	 * 批量删除一对多
	 *
	 * @param idList
	 */
	public void delBatchMain (Collection<? extends Serializable> idList);
	
}
