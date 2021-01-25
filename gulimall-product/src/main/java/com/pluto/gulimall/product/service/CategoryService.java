package com.pluto.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pluto.common.utils.PageUtils;
import com.pluto.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author pluto
 * @email 1776309879@qq.com
 * @date 2021-01-16 16:08:46
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
    /**
     * 查出所有分类以及子分类,以树形结构组织起来
     */
    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);

    /**
     * 找到catelogId的完整路径
     * @param catelogId
     * @return [父/子/孙]
     */
    Long[] findCatelogPath(Long catelogId);
}

