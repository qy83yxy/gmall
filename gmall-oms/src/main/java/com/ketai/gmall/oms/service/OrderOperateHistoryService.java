package com.ketai.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.oms.entity.OrderOperateHistoryEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 订单操作历史记录
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 10:26:42
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

