package com.ketai.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.ums.entity.GrowthChangeHistoryEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 成长值变化历史记录
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 16:56:49
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

