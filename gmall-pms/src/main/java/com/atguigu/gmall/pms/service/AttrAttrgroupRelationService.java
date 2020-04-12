package com.atguigu.gmall.pms.service;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 属性&属性分组关联
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-12 21:51:59
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

  PageVo queryPage(QueryCondition params);
}
