package com.pluto.gulimall.order.dao;

import com.pluto.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author pluto
 * @email 1776309879@qq.com
 * @date 2021-01-18 14:41:46
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
