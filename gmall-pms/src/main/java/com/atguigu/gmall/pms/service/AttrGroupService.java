package com.atguigu.gmall.pms.service;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.gmall.pms.entity.AttrGroupEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 属性分组
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-12 21:51:59
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

  PageVo queryPage(QueryCondition params);
}
