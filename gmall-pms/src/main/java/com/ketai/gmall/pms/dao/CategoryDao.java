package com.ketai.gmall.pms.dao;

import com.ketai.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 10:06:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
