package org.jeecg.modules.xwow.user.service;

import org.jeecg.modules.xwow.user.entity.XwCar;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * @Description: 购物车
 * @Author: jeecg-boot
 * @Date:   2022-09-23
 * @Version: V1.0
 */
public interface IXwCarService extends IService<XwCar> {

	/**
	 * 通过主表id查询子表数据
	 *
	 * @param mainId 主表id
	 * @return List<XwCar>
	 */
	public List<XwCar> selectByMainId(String mainId);
}
