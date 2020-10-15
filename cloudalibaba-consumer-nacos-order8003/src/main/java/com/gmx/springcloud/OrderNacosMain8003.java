package com.gmx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Mingxiang Guo
 * @Date: 2020/10/15 上午11:23
 * @Version: 1.0
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain8003 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain8003.class,args);
    }
}
