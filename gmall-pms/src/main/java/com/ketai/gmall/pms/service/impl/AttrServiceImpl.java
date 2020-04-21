package com.ketai.gmall.pms.service.impl;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ketai.gmall.pms.dao.AttrDao;
import com.ketai.gmall.pms.entity.AttrEntity;
import com.ketai.gmall.pms.service.AttrService;
import com.ketai.gmall.pms.vo.ListTypeById;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("attrService")
public class AttrServiceImpl extends ServiceImpl<AttrDao, AttrEntity> implements AttrService {
  @Resource AttrDao attrDao;

  @Override
  public PageVo queryPage(QueryCondition params) {
    IPage<AttrEntity> page =
        this.page(new Query<AttrEntity>().getPage(params), new QueryWrapper<AttrEntity>());

    return new PageVo(page);
  }

  @Override
  public PageVo listTypeById(ListTypeById byId) {
    if (byId.getLimit() == null) byId.setLimit(10);
    if (byId.getPage() == null) byId.setPage(1);
    Map<String, Object> map = new HashMap<>();
    map.put("catelog_id", byId.getCid());
    if (byId.getType() != null) {
      map.put("attr_type", byId.getType());
    }
    List<AttrEntity> list = attrDao.selectByMap(map);
    return new PageVo(list, list.size(), byId.getLimit(), byId.getPage());
  }
}
