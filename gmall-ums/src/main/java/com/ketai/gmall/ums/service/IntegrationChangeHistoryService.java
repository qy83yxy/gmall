package com.ketai.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.ums.entity.IntegrationChangeHistoryEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 积分变化历史记录
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 16:56:49
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

