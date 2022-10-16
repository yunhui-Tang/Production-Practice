package org.jeecg.modules.xwow.waterstation.service.impl;

import org.jeecg.modules.xwow.waterstation.entity.XwWaterStationGood;
import org.jeecg.modules.xwow.waterstation.mapper.XwWaterStationGoodMapper;
import org.jeecg.modules.xwow.waterstation.service.IXwWaterStationGoodService;
import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 水站商品中间表
 * @Author: jeecg-boot
 * @Date:   2022-09-24
 * @Version: V1.0
 */
@Service
public class XwWaterStationGoodServiceImpl extends ServiceImpl<XwWaterStationGoodMapper, XwWaterStationGood> implements IXwWaterStationGoodService {
	
	@Autowired
	private XwWaterStationGoodMapper xwWaterStationGoodMapper;
	
	@Override
	public List<XwWaterStationGood> selectByMainId(String mainId) {
		return xwWaterStationGoodMapper.selectByMainId(mainId);
	}
}
