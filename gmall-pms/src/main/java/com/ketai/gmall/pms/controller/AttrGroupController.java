package com.ketai.gmall.pms.controller;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import com.ketai.gmall.pms.entity.AttrGroupEntity;
import com.ketai.gmall.pms.service.AttrGroupService;
import com.ketai.gmall.pms.vo.ListGroupAndAttrById;
import com.ketai.gmall.pms.vo.ListGroupById;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * 属性分组
 *
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-14 10:06:35
 */
@Api(tags = "属性分组 管理")
@RestController
@RequestMapping("pms/attrgroup")
public class AttrGroupController {
  @Autowired private AttrGroupService attrGroupService;

  /** 列表 */
  @ApiOperation("分页查询(排序)")
  @GetMapping("/list")
  @PreAuthorize("hasAuthority('pms:attrgroup:list')")
  public Resp<PageVo> list(QueryCondition queryCondition) {
    PageVo page = attrGroupService.queryPage(queryCondition);

    return Resp.ok(page);
  }

  /** 信息 */
  @ApiOperation("详情查询")
  @GetMapping("/info/{attrGroupId}")
  @PreAuthorize("hasAuthority('pms:attrgroup:info')")
  public Resp<AttrGroupEntity> info(@PathVariable("attrGroupId") Long attrGroupId) {
    AttrGroupEntity attrGroup = attrGroupService.getById(attrGroupId);

    return Resp.ok(attrGroup);
  }

  /** 保存 */
  @ApiOperation("保存")
  @PostMapping("/save")
  @PreAuthorize("hasAuthority('pms:attrgroup:save')")
  public Resp<Object> save(@RequestBody AttrGroupEntity attrGroup) {
    attrGroupService.save(attrGroup);

    return Resp.ok(null);
  }

  /** 修改 */
  @ApiOperation("修改")
  @PostMapping("/update")
  @PreAuthorize("hasAuthority('pms:attrgroup:update')")
  public Resp<Object> update(@RequestBody AttrGroupEntity attrGroup) {
    attrGroupService.updateById(attrGroup);

    return Resp.ok(null);
  }

  /** 删除 */
  @ApiOperation("删除")
  @PostMapping("/delete")
  @PreAuthorize("hasAuthority('pms:attrgroup:delete')")
  public Resp<Object> delete(@RequestBody Long[] attrGroupIds) {
    attrGroupService.removeByIds(Arrays.asList(attrGroupIds));

    return Resp.ok(null);
  }

  /** 根据三级分类编号查询分组 */
  @ApiOperation("根据三级分类编号查询分组")
  @GetMapping("{catId}")
  @PreAuthorize("hasAuthority('pms:attrgroup')")
  public Resp<Object> listGroupById(ListGroupById groupById) {
    PageVo pageVo = attrGroupService.listGroupById(groupById);
    return Resp.ok(pageVo);
  }

  /** 查询组及组的规格参数 */
  @ApiOperation("查询组及组的规格参数")
  @GetMapping("/withattr/{gid}")
  @PreAuthorize("hasAuthority('pms:attrgroup:withattr')")
  public Resp<Object> listGroupAndAttrById(@PathVariable("gid") Integer attrGroupId) {
    if (attrGroupId == null) {
      return Resp.fail("无效操作");
    }
    ListGroupAndAttrById byId = attrGroupService.listGroupAndAttrById(attrGroupId);
    return Resp.ok(byId);
  }
}
