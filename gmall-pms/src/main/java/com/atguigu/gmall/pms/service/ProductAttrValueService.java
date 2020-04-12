package com.atguigu.gmall.pms.service;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.gmall.pms.entity.ProductAttrValueEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * spu属性值
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-12 21:51:59
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

  PageVo queryPage(QueryCondition params);
}
