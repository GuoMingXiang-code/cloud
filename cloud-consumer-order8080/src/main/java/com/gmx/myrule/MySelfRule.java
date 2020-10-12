package com.gmx.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Mingxiang Guo
 * @Date: 2020/10/12 上午7:40
 * @Version: 1.0
 * @Description:
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myrule() {
        return new RandomRule();
    }
}
