package com.ketai.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.ums.entity.MemberEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 16:56:49
 */
public interface MemberService extends IService<MemberEntity> {

    PageVo queryPage(QueryCondition params);
}

