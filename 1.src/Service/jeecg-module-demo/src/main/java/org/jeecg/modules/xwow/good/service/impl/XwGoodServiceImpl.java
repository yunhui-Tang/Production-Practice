package org.jeecg.modules.xwow.good.service.impl;

import org.jeecg.modules.xwow.good.entity.XwGood;
import org.jeecg.modules.xwow.good.entity.XwGoodAppraise;
import org.jeecg.modules.xwow.good.mapper.XwGoodAppraiseMapper;
import org.jeecg.modules.xwow.good.mapper.XwGoodMapper;
import org.jeecg.modules.xwow.good.service.IXwGoodService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Collection;

/**
 * @Description: 商品
 * @Author: jeecg-boot
 * @Date:   2022-09-28
 * @Version: V1.0
 */
@Service
public class XwGoodServiceImpl extends ServiceImpl<XwGoodMapper, XwGood> implements IXwGoodService {

	@Autowired
	private XwGoodMapper xwGoodMapper;
	@Autowired
	private XwGoodAppraiseMapper xwGoodAppraiseMapper;
	
	@Override
	@Transactional(rollbackFor = Exception.class)
	public void saveMain(XwGood xwGood, List<XwGoodAppraise> xwGoodAppraiseList) {
		xwGoodMapper.insert(xwGood);
		if(xwGoodAppraiseList!=null && xwGoodAppraiseList.size()>0) {
			for(XwGoodAppraise entity:xwGoodAppraiseList) {
				//外键设置
				entity.setGoodId(xwGood.getId());
				xwGoodAppraiseMapper.insert(entity);
			}
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateMain(XwGood xwGood,List<XwGoodAppraise> xwGoodAppraiseList) {
		xwGoodMapper.updateById(xwGood);
		
		//1.先删除子表数据
		xwGoodAppraiseMapper.deleteByMainId(xwGood.getId());
		
		//2.子表数据重新插入
		if(xwGoodAppraiseList!=null && xwGoodAppraiseList.size()>0) {
			for(XwGoodAppraise entity:xwGoodAppraiseList) {
				//外键设置
				entity.setGoodId(xwGood.getId());
				xwGoodAppraiseMapper.insert(entity);
			}
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void delMain(String id) {
		xwGoodAppraiseMapper.deleteByMainId(id);
		xwGoodMapper.deleteById(id);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void delBatchMain(Collection<? extends Serializable> idList) {
		for(Serializable id:idList) {
			xwGoodAppraiseMapper.deleteByMainId(id.toString());
			xwGoodMapper.deleteById(id);
		}
	}
	
}
