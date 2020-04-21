package com.ketai.gmall.pms.controller;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import com.ketai.gmall.pms.entity.AttrEntity;
import com.ketai.gmall.pms.service.AttrService;
import com.ketai.gmall.pms.vo.ListTypeById;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * 商品属性
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 10:06:35
 */
@Api(tags = "商品属性 管理")
@RestController
@RequestMapping("pms/attr")
public class AttrController {
  @Autowired private AttrService attrService;

  /** 列表 */
  @ApiOperation("分页查询(排序)")
  @GetMapping("/list")
  @PreAuthorize("hasAuthority('pms:attr:list')")
  public Resp<PageVo> list(QueryCondition queryCondition) {
    PageVo page = attrService.queryPage(queryCondition);

    return Resp.ok(page);
  }

  /** 信息 */
  @ApiOperation("详情查询")
  @GetMapping("/info/{attrId}")
  @PreAuthorize("hasAuthority('pms:attr:info')")
  public Resp<AttrEntity> info(@PathVariable("attrId") Long attrId) {
    AttrEntity attr = attrService.getById(attrId);

    return Resp.ok(attr);
  }

  /** 保存 */
  @ApiOperation("保存")
  @PostMapping("/save")
  @PreAuthorize("hasAuthority('pms:attr:save')")
  public Resp<Object> save(@RequestBody AttrEntity attr) {
    attrService.save(attr);

    return Resp.ok(null);
  }

  /** 修改 */
  @ApiOperation("修改")
  @PostMapping("/update")
  @PreAuthorize("hasAuthority('pms:attr:update')")
  public Resp<Object> update(@RequestBody AttrEntity attr) {
    attrService.updateById(attr);

    return Resp.ok(null);
  }

  /** 删除 */
  @ApiOperation("删除")
  @PostMapping("/delete")
  @PreAuthorize("hasAuthority('pms:attr:delete')")
  public Resp<Object> delete(@RequestBody Long[] attrIds) {
    attrService.removeByIds(Arrays.asList(attrIds));

    return Resp.ok(null);
  }

  /** 查询分类下的规格参数 */
  @ApiOperation("查询分类下的规格参数")
  @GetMapping("")
  @PreAuthorize("hasAuthority('pms:attr')")
  public Resp<PageVo> listTypeById(ListTypeById byId) {
    PageVo pageVo = attrService.listTypeById(byId);
    return Resp.ok(pageVo);
  }
}
