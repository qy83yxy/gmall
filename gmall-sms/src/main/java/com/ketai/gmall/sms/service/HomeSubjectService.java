package com.ketai.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.sms.entity.HomeSubjectEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 15:20:21
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageVo queryPage(QueryCondition params);
}

