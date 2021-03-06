package com.pluto.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pluto.common.utils.PageUtils;
import com.pluto.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author pluto
 * @email 1776309879@qq.com
 * @date 2021-01-18 14:02:35
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

