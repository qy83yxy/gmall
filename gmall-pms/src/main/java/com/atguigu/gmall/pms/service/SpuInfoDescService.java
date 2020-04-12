package com.atguigu.gmall.pms.service;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.gmall.pms.entity.SpuInfoDescEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * spu信息介绍
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-12 21:51:59
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

  PageVo queryPage(QueryCondition params);
}
