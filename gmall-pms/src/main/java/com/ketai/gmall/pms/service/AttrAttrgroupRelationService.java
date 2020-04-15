package com.ketai.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 属性&属性分组关联
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 10:06:35
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

