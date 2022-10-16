package org.jeecg.modules.xwow.user.mapper;

import java.util.List;
import org.jeecg.modules.xwow.user.entity.XwOrder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 订单
 * @Author: jeecg-boot
 * @Date:   2022-09-23
 * @Version: V1.0
 */
public interface XwOrderMapper extends BaseMapper<XwOrder> {

	/**
	 * 通过主表id删除子表数据
	 *
	 * @param mainId 主表id
	 * @return boolean
	 */
	public boolean deleteByMainId(@Param("mainId") String mainId);

  /**
   * 通过主表id查询子表数据
   *
   * @param mainId 主表id
   * @return List<XwOrder>
   */
	public List<XwOrder> selectByMainId(@Param("mainId") String mainId);
}
