package com.pluto.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pluto.common.utils.PageUtils;
import com.pluto.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author pluto
 * @email 1776309879@qq.com
 * @date 2021-01-16 16:08:47
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

