package com.gmx.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @Author: Mingxiang Guo
 * @Date: 2020/10/14 上午11:17
 * @Version: 1.0
 * @Description:
 */
@Component
@EnableBinding(Sink.class)
public class ReceiverMessageListenerController {
    @Value("${server.port}")
    private String serverPoet;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.out.println("消费者2号--------》收到的消息:" + message.getPayload()+"\t port:" + serverPoet);
    }
}
