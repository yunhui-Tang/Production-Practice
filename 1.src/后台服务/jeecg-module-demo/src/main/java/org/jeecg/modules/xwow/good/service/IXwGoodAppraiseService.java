package org.jeecg.modules.xwow.good.service;

import org.jeecg.modules.xwow.good.entity.XwGoodAppraise;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * @Description: 商品评价
 * @Author: jeecg-boot
 * @Date:   2022-09-28
 * @Version: V1.0
 */
public interface IXwGoodAppraiseService extends IService<XwGoodAppraise> {

	/**
	 * 通过主表id查询子表数据
	 *
	 * @param mainId 主表id
	 * @return List<XwGoodAppraise>
	 */
	public List<XwGoodAppraise> selectByMainId(String mainId);
}
