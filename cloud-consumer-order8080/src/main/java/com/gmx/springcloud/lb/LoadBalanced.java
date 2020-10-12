package com.gmx.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author: Mingxiang Guo
 * @Date: 2020/10/12 上午8:20
 * @Version: 1.0
 * @Description:
 */
public interface LoadBalanced {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
