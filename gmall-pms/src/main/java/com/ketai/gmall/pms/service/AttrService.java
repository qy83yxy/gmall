package com.ketai.gmall.pms.service;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.pms.entity.AttrEntity;
import com.ketai.gmall.pms.vo.ListTypeById;

/**
 * 商品属性
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 10:06:35
 */
public interface AttrService extends IService<AttrEntity> {
  /**
   * 分页查询
   *
   * @param params
   * @return
   */
  PageVo queryPage(QueryCondition params);

  /**
   * 查询分类下的规格参数
   *
   * @param byId
   * @return
   */
  PageVo listTypeById(ListTypeById byId);
}
