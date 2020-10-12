package com.gmx.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Mingxiang Guo
 * @Date: 2020/10/12 下午2:20
 * @Version: 1.0
 * @Description:
 */
@Service
public class PaymentService {

    /**
     * 正常访问，肯定ok
     *
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id) {
        return "线程池: " + Thread.currentThread().getName() + "paymentInfo_OK,id:" + id + "\t" + "O(∩_∩)O哈哈~";
    }


    /**
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentInfo_timeoutHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
    public String paymentInfo_timeout(Integer id) {
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: " + Thread.currentThread().getName() + "paymentInfo_timeout,id:" + id + "\t" + "O(∩_∩)O哈哈~" + "耗时(秒)" + timeNumber;
    }

    public String paymentInfo_timeoutHandler(Integer id) {
        return "线程池: " + Thread.currentThread().getName() + "系统繁忙，请稍后再试,id:" + id + "\t" + "┭┮﹏┭┮呜呜";
    }

}
