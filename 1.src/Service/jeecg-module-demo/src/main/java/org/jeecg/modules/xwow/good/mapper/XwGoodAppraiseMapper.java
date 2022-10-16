package org.jeecg.modules.xwow.good.mapper;

import java.util.List;
import org.jeecg.modules.xwow.good.entity.XwGoodAppraise;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description: 商品评价
 * @Author: jeecg-boot
 * @Date:   2022-09-28
 * @Version: V1.0
 */
public interface XwGoodAppraiseMapper extends BaseMapper<XwGoodAppraise> {

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
   * @return List<XwGoodAppraise>
   */
	public List<XwGoodAppraise> selectByMainId(@Param("mainId") String mainId);
}
