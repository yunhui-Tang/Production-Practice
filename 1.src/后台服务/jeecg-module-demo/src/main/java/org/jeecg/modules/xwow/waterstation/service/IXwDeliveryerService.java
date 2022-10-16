package org.jeecg.modules.xwow.waterstation.service;

import org.jeecg.modules.xwow.waterstation.entity.XwDeliveryer;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * @Description: 送水工
 * @Author: jeecg-boot
 * @Date:   2022-09-24
 * @Version: V1.0
 */
public interface IXwDeliveryerService extends IService<XwDeliveryer> {

	/**
	 * 通过主表id查询子表数据
	 *
	 * @param mainId 主表id
	 * @return List<XwDeliveryer>
	 */
	public List<XwDeliveryer> selectByMainId(String mainId);
}
