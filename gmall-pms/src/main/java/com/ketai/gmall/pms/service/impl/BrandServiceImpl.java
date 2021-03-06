package com.ketai.gmall.pms.service.impl;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ketai.gmall.pms.dao.BrandDao;
import com.ketai.gmall.pms.entity.BrandEntity;
import com.ketai.gmall.pms.service.BrandService;
import org.springframework.stereotype.Service;

@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

  @Override
  public PageVo queryPage(QueryCondition params) {
    IPage<BrandEntity> page =
        this.page(new Query<BrandEntity>().getPage(params), new QueryWrapper<BrandEntity>());
    return new PageVo(page);
  }
}
