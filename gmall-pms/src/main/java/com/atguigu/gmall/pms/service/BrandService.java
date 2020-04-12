package com.atguigu.gmall.pms.service;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.gmall.pms.entity.BrandEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 品牌
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-12 21:51:59
 */
public interface BrandService extends IService<BrandEntity> {

  PageVo queryPage(QueryCondition params);
}
