package com.gmx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Mingxiang Guo
 * @Date: 2020/10/9 上午9:40
 * @Version: 1.0
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkMain8080 {

    public static void main(String[] args) {
        SpringApplication.run(OrderZkMain8080.class,args);
    }
}
