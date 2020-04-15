package com.ketai.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.wms.entity.WareOrderTaskDetailEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 库存工作单
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 18:33:01
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageVo queryPage(QueryCondition params);
}

