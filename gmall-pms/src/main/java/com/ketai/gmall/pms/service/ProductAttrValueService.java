package com.ketai.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.pms.entity.ProductAttrValueEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * spu属性值
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 10:06:35
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageVo queryPage(QueryCondition params);
}

