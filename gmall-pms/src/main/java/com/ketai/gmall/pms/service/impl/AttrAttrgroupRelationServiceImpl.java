package com.ketai.gmall.pms.service.impl;

import com.alibaba.fastjson.JSON;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ketai.gmall.pms.dao.AttrAttrgroupRelationDao;
import com.ketai.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.ketai.gmall.pms.service.AttrAttrgroupRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service("attrAttrgroupRelationService")
public class AttrAttrgroupRelationServiceImpl
    extends ServiceImpl<AttrAttrgroupRelationDao, AttrAttrgroupRelationEntity>
    implements AttrAttrgroupRelationService {
  @Resource AttrAttrgroupRelationDao attrAttrgroupRelationDao;

  @Override
  public PageVo queryPage(QueryCondition params) {
    IPage<AttrAttrgroupRelationEntity> page =
        this.page(
            new Query<AttrAttrgroupRelationEntity>().getPage(params),
            new QueryWrapper<AttrAttrgroupRelationEntity>());
    return new PageVo(page);
  }

  @Override
  public boolean relationDeleteById(String json) {
    Map<String, Object> map = new HashMap<>();
    Map maps = JSON.parseObject(json.substring(1, json.length() - 1));
    for (Object obj : maps.entrySet()) {
      String key = ((Map.Entry) obj).getKey().toString().replace("I", "_i");
      String value = ((Map.Entry) obj).getValue().toString();
      boolean bool = true;
      do {
        int leng = key.length();
        for (int y = 0; y < leng; y++) {
          if (Character.isUpperCase(key.charAt(y))) {
            char w = key.charAt(y);
            key = key.replace(String.valueOf(w), "_" + (char) (w + 32));
            break;
          }
          if (y == (leng - 1)) {
            bool = false;
          }
        }
      } while (bool);
      map.put(key, value);
    }
    if (attrAttrgroupRelationDao.deleteByMap(map) < 1) return false;
    return true;
  }
}
