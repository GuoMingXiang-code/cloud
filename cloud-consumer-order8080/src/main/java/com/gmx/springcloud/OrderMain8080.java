package com.gmx.springcloud;

import com.gmx.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: Mingxiang Guo
 * @Date: 2020/10/7 21:26
 * @Version: 1.0
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class OrderMain8080 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain8080.class, args);
    }
}
