package com.pluto.gulimall.coupon.dao;

import com.pluto.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author pluto
 * @email 1776309879@qq.com
 * @date 2021-01-18 14:02:35
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
