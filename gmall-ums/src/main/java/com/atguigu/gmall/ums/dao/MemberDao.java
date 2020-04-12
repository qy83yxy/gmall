package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yuxingyou
 * @email qiyuanYXY@163.com
 * @date 2020-04-12 22:16:17
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
