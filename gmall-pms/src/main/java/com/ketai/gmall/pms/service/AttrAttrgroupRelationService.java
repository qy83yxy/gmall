package com.ketai.gmall.pms.service;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.pms.entity.AttrAttrgroupRelationEntity;

/**
 * 属性&属性分组关联
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 10:06:35
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {
  /**
   * 分页查询
   *
   * @param params
   * @return
   */
  PageVo queryPage(QueryCondition params);

  /**
   * 根据条件删除关系
   *
   * @param json
   * @return
   */
  boolean relationDeleteById(String json);
}
