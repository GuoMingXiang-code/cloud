package com.gmx.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Mingxiang Guo
 * @Date: 2020/10/14 下午5:40
 * @Version: 1.0
 * @Description:
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;


    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "nacos register, serverPort: " + serverPort + "\t  id" + id;
    }

}
