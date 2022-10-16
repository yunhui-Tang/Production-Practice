package org.jeecg.modules.xwow.good.service;

import org.jeecg.modules.xwow.good.entity.XwGoodAppraise;
import org.jeecg.modules.xwow.good.entity.XwGood;
import com.baomidou.mybatisplus.extension.service.IService;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @Description: 商品
 * @Author: jeecg-boot
 * @Date:   2022-09-28
 * @Version: V1.0
 */
public interface IXwGoodService extends IService<XwGood> {

	/**
	 * 添加一对多
	 *
	 * @param xwGood
	 * @param xwGoodAppraiseList
	 */
	public void saveMain(XwGood xwGood,List<XwGoodAppraise> xwGoodAppraiseList) ;
	
	/**
	 * 修改一对多
	 *
   * @param xwGood
   * @param xwGoodAppraiseList
	 */
	public void updateMain(XwGood xwGood,List<XwGoodAppraise> xwGoodAppraiseList);
	
	/**
	 * 删除一对多
	 *
	 * @param id
	 */
	public void delMain (String id);
	
	/**
	 * 批量删除一对多
	 *
	 * @param idList
	 */
	public void delBatchMain (Collection<? extends Serializable> idList);
	
}
