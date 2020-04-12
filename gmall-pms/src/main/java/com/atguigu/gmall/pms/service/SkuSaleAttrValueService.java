package com.atguigu.gmall.pms.service;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.gmall.pms.entity.SkuSaleAttrValueEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * sku销售属性&值
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-12 21:51:59
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

  PageVo queryPage(QueryCondition params);
}
