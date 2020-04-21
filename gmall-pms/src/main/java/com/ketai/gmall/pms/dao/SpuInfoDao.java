package com.ketai.gmall.pms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ketai.gmall.pms.entity.SpuInfoEntity;
import com.ketai.gmall.pms.vo.ListSpuById;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * spu信息
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 10:06:35
 */
@Mapper
public interface SpuInfoDao extends BaseMapper<SpuInfoEntity> {
  /**
   * 根据条件查询
   *
   * @param byId
   * @return
   */
  List<SpuInfoEntity> listSpuById(ListSpuById byId);
}
