package org.jeecg.modules.xwow.waterstation.service.impl;

import org.jeecg.modules.xwow.waterstation.entity.XwWaterStationMonthly;
import org.jeecg.modules.xwow.waterstation.mapper.XwWaterStationMonthlyMapper;
import org.jeecg.modules.xwow.waterstation.service.IXwWaterStationMonthlyService;
import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 水站月报
 * @Author: jeecg-boot
 * @Date:   2022-09-24
 * @Version: V1.0
 */
@Service
public class XwWaterStationMonthlyServiceImpl extends ServiceImpl<XwWaterStationMonthlyMapper, XwWaterStationMonthly> implements IXwWaterStationMonthlyService {
	
	@Autowired
	private XwWaterStationMonthlyMapper xwWaterStationMonthlyMapper;
	
	@Override
	public List<XwWaterStationMonthly> selectByMainId(String mainId) {
		return xwWaterStationMonthlyMapper.selectByMainId(mainId);
	}
}
