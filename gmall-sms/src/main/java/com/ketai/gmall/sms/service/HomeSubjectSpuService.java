package com.ketai.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.sms.entity.HomeSubjectSpuEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 专题商品
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 15:20:21
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageVo queryPage(QueryCondition params);
}

