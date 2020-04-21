package com.ketai.gmall.pms.service.impl;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ketai.gmall.pms.dao.AttrAttrgroupRelationDao;
import com.ketai.gmall.pms.dao.AttrDao;
import com.ketai.gmall.pms.dao.AttrGroupDao;
import com.ketai.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.ketai.gmall.pms.entity.AttrEntity;
import com.ketai.gmall.pms.entity.AttrGroupEntity;
import com.ketai.gmall.pms.service.AttrGroupService;
import com.ketai.gmall.pms.vo.ListGroupAndAttrById;
import com.ketai.gmall.pms.vo.ListGroupById;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity>
    implements AttrGroupService {
  @Resource AttrGroupDao attrGroupDao;
  @Resource AttrAttrgroupRelationDao attrAttrgroupRelationDao;
  @Resource AttrDao attrDao;

  @Override
  public PageVo queryPage(QueryCondition params) {
    IPage<AttrGroupEntity> page =
        this.page(
            new Query<AttrGroupEntity>().getPage(params), new QueryWrapper<AttrGroupEntity>());

    return new PageVo(page);
  }

  @Override
  public PageVo listGroupById(ListGroupById groupById) {
    if (groupById.getLimit() == null) groupById.setLimit(10);
    if (groupById.getPage() == null) groupById.setPage(1);
    Map<String, Object> map = new HashMap<>();
    if (groupById.getCatId() != null) map.put("catelog_id", groupById.getCatId());
    List<AttrGroupEntity> list = attrGroupDao.selectByMap(map);
    return new PageVo(list, list.size(), groupById.getLimit(), groupById.getPage());
  }

  @Override
  public ListGroupAndAttrById listGroupAndAttrById(Integer attrGroupId) {
    List<AttrEntity> attrEntities = new ArrayList<>();
    List<AttrAttrgroupRelationEntity> relations = new ArrayList<>();
    AttrGroupEntity entity = attrGroupDao.selectById(attrGroupId);
    ListGroupAndAttrById byId = new ListGroupAndAttrById(entity);
    Map<String, Object> map = new HashMap<>();
    map.put("attr_group_id", attrGroupId);
    List<AttrAttrgroupRelationEntity> list = attrAttrgroupRelationDao.selectByMap(map);
    for (AttrAttrgroupRelationEntity relationEntity : list) {
      attrEntities.add(attrDao.selectById(relationEntity.getAttrId()));
      relations.add(relationEntity);
    }
    byId.setAttrEntities(attrEntities);
    byId.setRelations(relations);
    return byId;
  }
}
