package com.ketai.gmall.pms.service.impl;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ketai.gmall.pms.dao.CategoryDao;
import com.ketai.gmall.pms.entity.CategoryEntity;
import com.ketai.gmall.pms.service.CategoryService;
import com.ketai.gmall.pms.vo.ListCategoryByLevel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity>
    implements CategoryService {
  @Resource CategoryDao categoryDao;

  @Override
  public PageVo queryPage(QueryCondition params) {
    IPage<CategoryEntity> page =
        this.page(new Query<CategoryEntity>().getPage(params), new QueryWrapper<CategoryEntity>());

    return new PageVo(page);
  }

  @Override
  public List<CategoryEntity> listCategoryByLevel(ListCategoryByLevel level) {
    Map<String, Object> map = new HashMap<>();
    // 当需要查询全部分类时不做条件
    if (level.getLevel() > 0) {
      map.put("cat_level", level.getLevel() + 1);
      if (level.getParentCid() != null) {
        map.put("parent_cid", level.getParentCid());
      }
    }
    return categoryDao.selectByMap(map);
  }
}
