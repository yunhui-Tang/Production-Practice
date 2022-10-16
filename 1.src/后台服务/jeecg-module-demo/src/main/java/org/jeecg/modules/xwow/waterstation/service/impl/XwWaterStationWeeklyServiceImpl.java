package org.jeecg.modules.xwow.waterstation.service.impl;

import org.jeecg.modules.xwow.waterstation.entity.XwWaterStationWeekly;
import org.jeecg.modules.xwow.waterstation.mapper.XwWaterStationWeeklyMapper;
import org.jeecg.modules.xwow.waterstation.service.IXwWaterStationWeeklyService;
import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 水站周报
 * @Author: jeecg-boot
 * @Date:   2022-09-24
 * @Version: V1.0
 */
@Service
public class XwWaterStationWeeklyServiceImpl extends ServiceImpl<XwWaterStationWeeklyMapper, XwWaterStationWeekly> implements IXwWaterStationWeeklyService {
	
	@Autowired
	private XwWaterStationWeeklyMapper xwWaterStationWeeklyMapper;
	
	@Override
	public List<XwWaterStationWeekly> selectByMainId(String mainId) {
		return xwWaterStationWeeklyMapper.selectByMainId(mainId);
	}
}
