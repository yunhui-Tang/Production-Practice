package org.jeecg.modules.xwow.waterstation.service.impl;

import org.jeecg.modules.xwow.waterstation.entity.XwDeliveryer;
import org.jeecg.modules.xwow.waterstation.mapper.XwDeliveryerMapper;
import org.jeecg.modules.xwow.waterstation.service.IXwDeliveryerService;
import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 送水工
 * @Author: jeecg-boot
 * @Date:   2022-09-24
 * @Version: V1.0
 */
@Service
public class XwDeliveryerServiceImpl extends ServiceImpl<XwDeliveryerMapper, XwDeliveryer> implements IXwDeliveryerService {
	
	@Autowired
	private XwDeliveryerMapper xwDeliveryerMapper;
	
	@Override
	public List<XwDeliveryer> selectByMainId(String mainId) {
		return xwDeliveryerMapper.selectByMainId(mainId);
	}
}
