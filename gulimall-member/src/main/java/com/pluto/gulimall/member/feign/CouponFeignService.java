package com.pluto.gulimall.member.feign;

import com.pluto.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @title: CouponFeignService
 * @Author pluto
 * @Date: 2021/1/18 18:21
 * @Version 1.0
 * 这是一个声明式的远程调用
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
