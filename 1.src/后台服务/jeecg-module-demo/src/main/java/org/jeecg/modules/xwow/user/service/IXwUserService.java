package org.jeecg.modules.xwow.user.service;

import org.jeecg.modules.xwow.user.entity.XwOrder;
import org.jeecg.modules.xwow.user.entity.XwCar;
import org.jeecg.modules.xwow.user.entity.XwUser;
import com.baomidou.mybatisplus.extension.service.IService;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @Description: 用户
 * @Author: jeecg-boot
 * @Date:   2022-09-23
 * @Version: V1.0
 */
public interface IXwUserService extends IService<XwUser> {

	/**
	 * 添加一对多
	 *
	 * @param xwUser
	 * @param xwOrderList
	 * @param xwCarList
	 */
	public void saveMain(XwUser xwUser,List<XwOrder> xwOrderList,List<XwCar> xwCarList) ;
	
	/**
	 * 修改一对多
	 *
   * @param xwUser
   * @param xwOrderList
   * @param xwCarList
	 */
	public void updateMain(XwUser xwUser,List<XwOrder> xwOrderList,List<XwCar> xwCarList);
	
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
