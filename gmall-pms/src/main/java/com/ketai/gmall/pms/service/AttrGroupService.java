package com.ketai.gmall.pms.service;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.pms.entity.AttrGroupEntity;
import com.ketai.gmall.pms.vo.ListGroupAndAttrById;
import com.ketai.gmall.pms.vo.ListGroupById;

/**
 * 属性分组
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 10:06:35
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {
  /**
   * 分组查询
   *
   * @param params
   * @return
   */
  PageVo queryPage(QueryCondition params);

  /**
   * 查询属性分组
   *
   * @param groupById
   * @return
   */
  PageVo listGroupById(ListGroupById groupById);

  /**
   * 查询组及组的规格参数
   *
   * @param attrGroupId
   * @return
   */
  ListGroupAndAttrById listGroupAndAttrById(Integer attrGroupId);
}
