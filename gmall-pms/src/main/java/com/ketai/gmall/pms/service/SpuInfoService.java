package com.ketai.gmall.pms.service;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.pms.entity.SpuInfoEntity;
import com.ketai.gmall.pms.vo.ListSpuById;

/**
 * spu信息
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 10:06:35
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {
  /**
   * 分页查询
   *
   * @param params
   * @return
   */
  PageVo queryPage(QueryCondition params);

  /**
   * 根据条件查询
   *
   * @param byId
   * @return
   */
  PageVo listSpuById(ListSpuById byId);
}
