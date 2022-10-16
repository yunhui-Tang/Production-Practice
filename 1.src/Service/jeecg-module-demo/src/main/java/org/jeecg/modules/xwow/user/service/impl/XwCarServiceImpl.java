package org.jeecg.modules.xwow.user.service.impl;

import org.jeecg.modules.xwow.user.entity.XwCar;
import org.jeecg.modules.xwow.user.mapper.XwCarMapper;
import org.jeecg.modules.xwow.user.service.IXwCarService;
import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 购物车
 * @Author: jeecg-boot
 * @Date:   2022-09-23
 * @Version: V1.0
 */
@Service
public class XwCarServiceImpl extends ServiceImpl<XwCarMapper, XwCar> implements IXwCarService {
	
	@Autowired
	private XwCarMapper xwCarMapper;
	
	@Override
	public List<XwCar> selectByMainId(String mainId) {
		return xwCarMapper.selectByMainId(mainId);
	}
}
