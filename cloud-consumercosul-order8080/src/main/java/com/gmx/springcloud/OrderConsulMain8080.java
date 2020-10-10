package com.gmx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Mingxiang Guo
 * @Date: 2020/10/9 上午11:04
 * @Version: 1.0
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain8080 {

    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain8080.class,args);
    }
}
