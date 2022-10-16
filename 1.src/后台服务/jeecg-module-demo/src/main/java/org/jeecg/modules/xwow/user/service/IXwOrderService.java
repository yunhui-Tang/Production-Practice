package org.jeecg.modules.xwow.user.service;

import org.jeecg.modules.xwow.user.entity.XwOrder;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * @Description: 订单
 * @Author: jeecg-boot
 * @Date:   2022-09-23
 * @Version: V1.0
 */
public interface IXwOrderService extends IService<XwOrder> {

	/**
	 * 通过主表id查询子表数据
	 *
	 * @param mainId 主表id
	 * @return List<XwOrder>
	 */
	public List<XwOrder> selectByMainId(String mainId);
}
