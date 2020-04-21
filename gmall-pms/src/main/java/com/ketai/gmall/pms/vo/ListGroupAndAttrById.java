package com.ketai.gmall.pms.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.ketai.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.ketai.gmall.pms.entity.AttrEntity;
import com.ketai.gmall.pms.entity.AttrGroupEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ListGroupAndAttrById implements Serializable {
  /** 分组id */
  @TableId
  @ApiModelProperty(name = "attrGroupId", value = "分组id")
  private Long attrGroupId;

  /** 组名 */
  @ApiModelProperty(name = "attrGroupName", value = "组名")
  private String attrGroupName;

  /** 排序 */
  @ApiModelProperty(name = "sort", value = "排序")
  private Integer sort;

  /** 描述 */
  @ApiModelProperty(name = "descript", value = "描述")
  private String descript;

  /** 组图标 */
  @ApiModelProperty(name = "icon", value = "组图标")
  private String icon;

  /** 所属分类id */
  @ApiModelProperty(name = "catelogId", value = "所属分类id")
  private Long catelogId;

  /** 商品属性集合 */
  private List<AttrEntity> attrEntities;

  /** 属性管理关系 */
  private List<AttrAttrgroupRelationEntity> relations;

  public ListGroupAndAttrById() {}

  public ListGroupAndAttrById(AttrGroupEntity entity) {
    this.attrGroupId = entity.getAttrGroupId();
    this.attrGroupName = entity.getAttrGroupName();
    this.sort = entity.getSort();
    this.descript = entity.getDescript();
    this.icon = entity.getIcon();
    this.catelogId = entity.getCatelogId();
  }
}
