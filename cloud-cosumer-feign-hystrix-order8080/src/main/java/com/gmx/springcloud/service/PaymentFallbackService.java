package com.gmx.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author: Mingxiang Guo
 * @Date: 2020/10/12 下午5:12
 * @Version: 1.0
 * @Description:
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_ok(Integer id) {
        return "------PaymentFallbackService fall back-paymentInfo_ok";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {
        return "------PaymentFallbackService fall back-paymentInfo_timeout";
    }
}
