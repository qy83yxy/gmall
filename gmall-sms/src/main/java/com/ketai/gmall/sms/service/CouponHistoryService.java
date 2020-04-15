package com.ketai.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.sms.entity.CouponHistoryEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 优惠券领取历史记录
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 15:20:22
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

