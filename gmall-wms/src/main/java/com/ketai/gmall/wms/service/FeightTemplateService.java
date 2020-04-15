package com.ketai.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.wms.entity.FeightTemplateEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 运费模板
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 18:33:01
 */
public interface FeightTemplateService extends IService<FeightTemplateEntity> {

    PageVo queryPage(QueryCondition params);
}

