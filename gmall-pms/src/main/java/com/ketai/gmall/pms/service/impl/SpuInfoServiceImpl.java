package com.ketai.gmall.pms.service.impl;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ketai.gmall.pms.dao.SpuInfoDao;
import com.ketai.gmall.pms.entity.SpuInfoEntity;
import com.ketai.gmall.pms.service.SpuInfoService;
import com.ketai.gmall.pms.vo.ListSpuById;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("spuInfoService")
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoDao, SpuInfoEntity>
    implements SpuInfoService {
  @Resource SpuInfoDao spuInfoDao;

  @Override
  public PageVo queryPage(QueryCondition params) {
    IPage<SpuInfoEntity> page =
        this.page(new Query<SpuInfoEntity>().getPage(params), new QueryWrapper<SpuInfoEntity>());

    return new PageVo(page);
  }

  @Override
  public PageVo listSpuById(ListSpuById byId) {
    List<SpuInfoEntity> list = spuInfoDao.listSpuById(byId);
    return new PageVo(list, list.size(), byId.getLimit(), byId.getPage());
  }
}
