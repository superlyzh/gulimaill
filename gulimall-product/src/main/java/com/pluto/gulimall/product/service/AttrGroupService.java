package com.pluto.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pluto.common.utils.PageUtils;
import com.pluto.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author pluto
 * @email 1776309879@qq.com
 * @date 2021-01-16 16:08:46
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPage(Map<String, Object> params, Long catelogId);
}

