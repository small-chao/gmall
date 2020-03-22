package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chao
 * @email 1194875681@qq.com
 * @date 2020-03-22 11:24:43
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
