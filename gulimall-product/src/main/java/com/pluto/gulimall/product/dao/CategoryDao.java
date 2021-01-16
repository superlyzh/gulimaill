package com.pluto.gulimall.product.dao;

import com.pluto.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author pluto
 * @email 1776309879@qq.com
 * @date 2021-01-16 16:08:46
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
