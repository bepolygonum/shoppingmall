package com.member.feign;

import com.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@FeignClient(name = "coupon",url = "127.0.0.1:6007")
@Resource
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    R getMemberCoupons();

}
