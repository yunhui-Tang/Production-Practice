package org.jeecg.modules.xwow.user.service.impl;

import org.jeecg.modules.xwow.user.entity.XwOrder;
import org.jeecg.modules.xwow.user.mapper.XwOrderMapper;
import org.jeecg.modules.xwow.user.service.IXwOrderService;
import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 订单
 * @Author: jeecg-boot
 * @Date:   2022-09-23
 * @Version: V1.0
 */
@Service
public class XwOrderServiceImpl extends ServiceImpl<XwOrderMapper, XwOrder> implements IXwOrderService {
	
	@Autowired
	private XwOrderMapper xwOrderMapper;
	
	@Override
	public List<XwOrder> selectByMainId(String mainId) {
		return xwOrderMapper.selectByMainId(mainId);
	}
}
