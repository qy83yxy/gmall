package com.ketai.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.ums.entity.MemberStatisticsInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员统计信息
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 16:56:48
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

