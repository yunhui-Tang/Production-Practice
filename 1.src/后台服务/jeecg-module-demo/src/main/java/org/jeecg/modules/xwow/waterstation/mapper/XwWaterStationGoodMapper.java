package org.jeecg.modules.xwow.waterstation.mapper;

import java.util.List;
import org.jeecg.modules.xwow.waterstation.entity.XwWaterStationGood;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 水站商品中间表
 * @Author: jeecg-boot
 * @Date:   2022-09-24
 * @Version: V1.0
 */
public interface XwWaterStationGoodMapper extends BaseMapper<XwWaterStationGood> {

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
   * @return List<XwWaterStationGood>
   */
	public List<XwWaterStationGood> selectByMainId(@Param("mainId") String mainId);
}
