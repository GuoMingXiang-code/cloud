package com.gmx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Mingxiang Guo
 * @Date: 2020/10/7 21:26
 * @Version: 1.0
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain8080 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain8080.class,args);
    }
}
