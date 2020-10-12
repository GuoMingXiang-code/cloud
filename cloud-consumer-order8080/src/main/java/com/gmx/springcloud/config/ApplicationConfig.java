package com.gmx.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Mingxiang Guo
 * @Date: 2020/10/7 21:35
 * @Version: 1.0
 * @Description:
 */
@Configuration
public class ApplicationConfig {

    @Bean
//    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
