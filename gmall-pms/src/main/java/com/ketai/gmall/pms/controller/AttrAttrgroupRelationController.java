package com.ketai.gmall.pms.controller;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import com.ketai.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.ketai.gmall.pms.service.AttrAttrgroupRelationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * 属性&属性分组关联
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 10:06:35
 */
@Api(tags = "属性&属性分组关联 管理")
@RestController
@RequestMapping("pms/attrattrgrouprelation")
public class AttrAttrgroupRelationController {
  @Autowired private AttrAttrgroupRelationService attrAttrgroupRelationService;

  /** 列表 */
  @ApiOperation("分页查询(排序)")
  @GetMapping("/list")
  @PreAuthorize("hasAuthority('pms:attrattrgrouprelation:list')")
  public Resp<PageVo> list(QueryCondition queryCondition) {
    PageVo page = attrAttrgroupRelationService.queryPage(queryCondition);

    return Resp.ok(page);
  }

  /** 信息 */
  @ApiOperation("详情查询")
  @GetMapping("/info/{id}")
  @PreAuthorize("hasAuthority('pms:attrattrgrouprelation:info')")
  public Resp<AttrAttrgroupRelationEntity> info(@PathVariable("id") Long id) {
    AttrAttrgroupRelationEntity attrAttrgroupRelation = attrAttrgroupRelationService.getById(id);

    return Resp.ok(attrAttrgroupRelation);
  }

  /** 保存 */
  @ApiOperation("保存")
  @PostMapping("/save")
  @PreAuthorize("hasAuthority('pms:attrattrgrouprelation:save')")
  public Resp<Object> save(@RequestBody AttrAttrgroupRelationEntity attrAttrgroupRelation) {
    attrAttrgroupRelationService.save(attrAttrgroupRelation);

    return Resp.ok(null);
  }

  /** 修改 */
  @ApiOperation("修改")
  @PostMapping("/update")
  @PreAuthorize("hasAuthority('pms:attrattrgrouprelation:update')")
  public Resp<Object> update(@RequestBody AttrAttrgroupRelationEntity attrAttrgroupRelation) {
    attrAttrgroupRelationService.updateById(attrAttrgroupRelation);

    return Resp.ok(null);
  }

  /** 删除 */
  @ApiOperation("删除")
  @PostMapping("/delete")
  @PreAuthorize("hasAuthority('pms:attrattrgrouprelation:delete')")
  public Resp<Object> delete(@RequestBody Long[] ids) {
    attrAttrgroupRelationService.removeByIds(Arrays.asList(ids));
    return Resp.ok(null);
  }

  /** 删除 */
  @ApiOperation("删除关联关系")
  @PostMapping("/delete/attr")
  @PreAuthorize("hasAuthority('pms:attrattrgrouprelation:delete:attr')")
  public Resp<Object> relationDeleteById(@RequestBody String json) {
    if (attrAttrgroupRelationService.relationDeleteById(json)) return Resp.ok(null);
    return Resp.fail("删除失败");
  }
}
