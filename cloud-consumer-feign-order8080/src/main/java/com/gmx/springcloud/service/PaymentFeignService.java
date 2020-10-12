package com.gmx.springcloud.service;

import com.gmx.springcloud.entities.CommonResult;
import com.gmx.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: Mingxiang Guo
 * @Date: 2020/10/12 上午9:52
 * @Version: 1.0
 * @Description:
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    //CommonResult<Payment> getPaymentById(Long id);
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
