package org.jeecg.modules.xwow.waterstation.service.impl;

import org.jeecg.modules.xwow.waterstation.entity.XwWaterStation;
import org.jeecg.modules.xwow.waterstation.entity.XwWaterStationWeekly;
import org.jeecg.modules.xwow.waterstation.entity.XwWaterStationMonthly;
import org.jeecg.modules.xwow.waterstation.entity.XwDeliveryer;
import org.jeecg.modules.xwow.waterstation.entity.XwWaterStationGood;
import org.jeecg.modules.xwow.waterstation.mapper.XwWaterStationWeeklyMapper;
import org.jeecg.modules.xwow.waterstation.mapper.XwWaterStationMonthlyMapper;
import org.jeecg.modules.xwow.waterstation.mapper.XwDeliveryerMapper;
import org.jeecg.modules.xwow.waterstation.mapper.XwWaterStationGoodMapper;
import org.jeecg.modules.xwow.waterstation.mapper.XwWaterStationMapper;
import org.jeecg.modules.xwow.waterstation.service.IXwWaterStationService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Collection;

/**
 * @Description: 水站
 * @Author: jeecg-boot
 * @Date:   2022-09-24
 * @Version: V1.0
 */
@Service
public class XwWaterStationServiceImpl extends ServiceImpl<XwWaterStationMapper, XwWaterStation> implements IXwWaterStationService {

	@Autowired
	private XwWaterStationMapper xwWaterStationMapper;
	@Autowired
	private XwWaterStationWeeklyMapper xwWaterStationWeeklyMapper;
	@Autowired
	private XwWaterStationMonthlyMapper xwWaterStationMonthlyMapper;
	@Autowired
	private XwDeliveryerMapper xwDeliveryerMapper;
	@Autowired
	private XwWaterStationGoodMapper xwWaterStationGoodMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void saveMain(XwWaterStation xwWaterStation, List<XwWaterStationWeekly> xwWaterStationWeeklyList,List<XwWaterStationMonthly> xwWaterStationMonthlyList,List<XwDeliveryer> xwDeliveryerList,List<XwWaterStationGood> xwWaterStationGoodList) {
		xwWaterStationMapper.insert(xwWaterStation);
		if(xwWaterStationWeeklyList!=null && xwWaterStationWeeklyList.size()>0) {
			for(XwWaterStationWeekly entity:xwWaterStationWeeklyList) {
				//外键设置
				entity.setWaterStationId(xwWaterStation.getId());
				xwWaterStationWeeklyMapper.insert(entity);
			}
		}
		if(xwWaterStationMonthlyList!=null && xwWaterStationMonthlyList.size()>0) {
			for(XwWaterStationMonthly entity:xwWaterStationMonthlyList) {
				//外键设置
				entity.setWaterStationId(xwWaterStation.getId());
				xwWaterStationMonthlyMapper.insert(entity);
			}
		}
		if(xwDeliveryerList!=null && xwDeliveryerList.size()>0) {
			for(XwDeliveryer entity:xwDeliveryerList) {
				//外键设置
				entity.setWaterStationId(xwWaterStation.getId());
				xwDeliveryerMapper.insert(entity);
			}
		}
		if(xwWaterStationGoodList!=null && xwWaterStationGoodList.size()>0) {
			for(XwWaterStationGood entity:xwWaterStationGoodList) {
				//外键设置
				entity.setGoodId(xwWaterStation.getId());
				xwWaterStationGoodMapper.insert(entity);
			}
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateMain(XwWaterStation xwWaterStation,List<XwWaterStationWeekly> xwWaterStationWeeklyList,List<XwWaterStationMonthly> xwWaterStationMonthlyList,List<XwDeliveryer> xwDeliveryerList,List<XwWaterStationGood> xwWaterStationGoodList) {
		xwWaterStationMapper.updateById(xwWaterStation);
		
		//1.先删除子表数据
		xwWaterStationWeeklyMapper.deleteByMainId(xwWaterStation.getId());
		xwWaterStationMonthlyMapper.deleteByMainId(xwWaterStation.getId());
		xwDeliveryerMapper.deleteByMainId(xwWaterStation.getId());
		xwWaterStationGoodMapper.deleteByMainId(xwWaterStation.getId());
		
		//2.子表数据重新插入
		if(xwWaterStationWeeklyList!=null && xwWaterStationWeeklyList.size()>0) {
			for(XwWaterStationWeekly entity:xwWaterStationWeeklyList) {
				//外键设置
				entity.setWaterStationId(xwWaterStation.getId());
				xwWaterStationWeeklyMapper.insert(entity);
			}
		}
		if(xwWaterStationMonthlyList!=null && xwWaterStationMonthlyList.size()>0) {
			for(XwWaterStationMonthly entity:xwWaterStationMonthlyList) {
				//外键设置
				entity.setWaterStationId(xwWaterStation.getId());
				xwWaterStationMonthlyMapper.insert(entity);
			}
		}
		if(xwDeliveryerList!=null && xwDeliveryerList.size()>0) {
			for(XwDeliveryer entity:xwDeliveryerList) {
				//外键设置
				entity.setWaterStationId(xwWaterStation.getId());
				xwDeliveryerMapper.insert(entity);
			}
		}
		if(xwWaterStationGoodList!=null && xwWaterStationGoodList.size()>0) {
			for(XwWaterStationGood entity:xwWaterStationGoodList) {
				//外键设置
				entity.setGoodId(xwWaterStation.getId());
				xwWaterStationGoodMapper.insert(entity);
			}
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void delMain(String id) {
		xwWaterStationWeeklyMapper.deleteByMainId(id);
		xwWaterStationMonthlyMapper.deleteByMainId(id);
		xwDeliveryerMapper.deleteByMainId(id);
		xwWaterStationGoodMapper.deleteByMainId(id);
		xwWaterStationMapper.deleteById(id);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void delBatchMain(Collection<? extends Serializable> idList) {
		for(Serializable id:idList) {
			xwWaterStationWeeklyMapper.deleteByMainId(id.toString());
			xwWaterStationMonthlyMapper.deleteByMainId(id.toString());
			xwDeliveryerMapper.deleteByMainId(id.toString());
			xwWaterStationGoodMapper.deleteByMainId(id.toString());
			xwWaterStationMapper.deleteById(id);
		}
	}
	
}
