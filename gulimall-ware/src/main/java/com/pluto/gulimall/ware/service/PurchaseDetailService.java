package com.pluto.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pluto.common.utils.PageUtils;
import com.pluto.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author pluto
 * @email 1776309879@qq.com
 * @date 2021-01-18 14:47:24
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

