package org.jeecg.modules.xwow.good.service.impl;

import org.jeecg.modules.xwow.good.entity.XwGoodAppraise;
import org.jeecg.modules.xwow.good.mapper.XwGoodAppraiseMapper;
import org.jeecg.modules.xwow.good.service.IXwGoodAppraiseService;
import org.springframework.stereotype.Service;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: 商品评价
 * @Author: jeecg-boot
 * @Date:   2022-09-28
 * @Version: V1.0
 */
@Service
public class XwGoodAppraiseServiceImpl extends ServiceImpl<XwGoodAppraiseMapper, XwGoodAppraise> implements IXwGoodAppraiseService {
	
	@Autowired
	private XwGoodAppraiseMapper xwGoodAppraiseMapper;
	
	@Override
	public List<XwGoodAppraise> selectByMainId(String mainId) {
		return xwGoodAppraiseMapper.selectByMainId(mainId);
	}
}
