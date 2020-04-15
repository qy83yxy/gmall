package com.ketai.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.ums.entity.MemberCollectSubjectEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员收藏的专题活动
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 16:56:49
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageVo queryPage(QueryCondition params);
}

