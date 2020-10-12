package com.gmx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: Mingxiang Guo
 * @Date: 2020/10/12 上午9:49
 * @Version: 1.0
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain8080 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain8080.class,args);
    }
}
