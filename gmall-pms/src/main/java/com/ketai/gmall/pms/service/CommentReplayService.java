package com.ketai.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.pms.entity.CommentReplayEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品评价回复关系
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 10:06:35
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageVo queryPage(QueryCondition params);
}

