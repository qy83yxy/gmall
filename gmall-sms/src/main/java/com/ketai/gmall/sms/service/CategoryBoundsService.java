package com.ketai.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.sms.entity.CategoryBoundsEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品分类积分设置
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 15:20:22
 */
public interface CategoryBoundsService extends IService<CategoryBoundsEntity> {

    PageVo queryPage(QueryCondition params);
}

