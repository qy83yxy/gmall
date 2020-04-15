package com.ketai.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.wms.entity.WareInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 仓库信息
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 18:33:01
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

