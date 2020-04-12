package com.atguigu.gmall.pms.service.impl;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.gmall.pms.dao.SpuCommentDao;
import com.atguigu.gmall.pms.entity.SpuCommentEntity;
import com.atguigu.gmall.pms.service.SpuCommentService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service("spuCommentService")
public class SpuCommentServiceImpl extends ServiceImpl<SpuCommentDao, SpuCommentEntity>
    implements SpuCommentService {

  @Override
  public PageVo queryPage(QueryCondition params) {
    IPage<SpuCommentEntity> page =
        this.page(
            new Query<SpuCommentEntity>().getPage(params), new QueryWrapper<SpuCommentEntity>());

    return new PageVo(page);
  }
}
