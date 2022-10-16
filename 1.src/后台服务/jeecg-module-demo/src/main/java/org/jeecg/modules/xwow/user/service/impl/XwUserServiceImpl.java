package org.jeecg.modules.xwow.user.service.impl;

import org.jeecg.modules.xwow.user.entity.XwUser;
import org.jeecg.modules.xwow.user.entity.XwOrder;
import org.jeecg.modules.xwow.user.entity.XwCar;
import org.jeecg.modules.xwow.user.mapper.XwOrderMapper;
import org.jeecg.modules.xwow.user.mapper.XwCarMapper;
import org.jeecg.modules.xwow.user.mapper.XwUserMapper;
import org.jeecg.modules.xwow.user.service.IXwUserService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Collection;

/**
 * @Description: 用户
 * @Author: jeecg-boot
 * @Date:   2022-09-23
 * @Version: V1.0
 */
@Service
public class XwUserServiceImpl extends ServiceImpl<XwUserMapper, XwUser> implements IXwUserService {

	@Autowired
	private XwUserMapper xwUserMapper;
	@Autowired
	private XwOrderMapper xwOrderMapper;
	@Autowired
	private XwCarMapper xwCarMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void saveMain(XwUser xwUser, List<XwOrder> xwOrderList,List<XwCar> xwCarList) {
		xwUserMapper.insert(xwUser);
		if(xwOrderList!=null && xwOrderList.size()>0) {
			for(XwOrder entity:xwOrderList) {
				//外键设置
				entity.setUserId(xwUser.getId());
				xwOrderMapper.insert(entity);
			}
		}
		if(xwCarList!=null && xwCarList.size()>0) {
			for(XwCar entity:xwCarList) {
				//外键设置
				entity.setUserId(xwUser.getId());
				xwCarMapper.insert(entity);
			}
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateMain(XwUser xwUser,List<XwOrder> xwOrderList,List<XwCar> xwCarList) {
		xwUserMapper.updateById(xwUser);
		
		//1.先删除子表数据
		xwOrderMapper.deleteByMainId(xwUser.getId());
		xwCarMapper.deleteByMainId(xwUser.getId());
		
		//2.子表数据重新插入
		if(xwOrderList!=null && xwOrderList.size()>0) {
			for(XwOrder entity:xwOrderList) {
				//外键设置
				entity.setUserId(xwUser.getId());
				xwOrderMapper.insert(entity);
			}
		}
		if(xwCarList!=null && xwCarList.size()>0) {
			for(XwCar entity:xwCarList) {
				//外键设置
				entity.setUserId(xwUser.getId());
				xwCarMapper.insert(entity);
			}
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void delMain(String id) {
		xwOrderMapper.deleteByMainId(id);
		xwCarMapper.deleteByMainId(id);
		xwUserMapper.deleteById(id);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void delBatchMain(Collection<? extends Serializable> idList) {
		for(Serializable id:idList) {
			xwOrderMapper.deleteByMainId(id.toString());
			xwCarMapper.deleteByMainId(id.toString());
			xwUserMapper.deleteById(id);
		}
	}
	
}
