package com.ketai.gmall.pms.service;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ketai.gmall.pms.entity.CategoryEntity;
import com.ketai.gmall.pms.vo.ListCategoryByLevel;

import java.util.List;

/**
 * 商品三级分类
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 10:06:34
 */
public interface CategoryService extends IService<CategoryEntity> {
  /**
   * 分页查询
   *
   * @param params
   * @return
   */
  PageVo queryPage(QueryCondition params);

  /**
   * 分类查询
   *
   * @param level
   * @return
   */
  List<CategoryEntity> listCategoryByLevel(ListCategoryByLevel level);
}
