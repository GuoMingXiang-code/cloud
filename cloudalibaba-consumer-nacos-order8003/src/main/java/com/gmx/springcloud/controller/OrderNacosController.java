package com.gmx.springcloud.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Mingxiang Guo
 * @Date: 2020/10/15 下午1:52
 * @Version: 1.0
 * @Description:
 */
@RestController
@Slf4j
public class OrderNacosController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${server-url.nacos-user-service}")
    private String serverURL;

    @Value("${python.django.url}")
    private String url;


    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String payment(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(serverURL+"/payment/nacos/"+id,String.class);
    }


    @GetMapping("/python/get")
    public String testDjangoGet() {
        ResponseEntity<String> exchange = restTemplate.exchange(url + "/get", HttpMethod.GET, null, String.class);
        HttpStatus statusCode = exchange.getStatusCode();
        int statusCodeValue = exchange.getStatusCodeValue();
        String storeNumber = exchange.toString();
        String body = exchange.getBody();
        System.out.println(statusCode);
        System.out.println(statusCodeValue);
        System.out.println(storeNumber);
        System.out.println(body);
        JSONObject parse = JSON.parseObject(body);
        String message = parse.get("a").toString();
        log.info("*******message:" + message);
        return message;
    }

    @GetMapping("/python/post")
    public String testDjangoPost() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        JSONObject param = new JSONObject();
        double[][] data = {{2.3,4.5,6.7},{1.0,2.0,3.0}};
        param.put("a",data);

        HttpEntity<String> entity = new HttpEntity<>(param.toString(), httpHeaders);
        ResponseEntity<String> exchange = restTemplate.exchange(url + "post", HttpMethod.POST, entity, String.class);
        HttpStatus statusCode = exchange.getStatusCode();
        int statusCodeValue = exchange.getStatusCodeValue();
        String storeNumber = exchange.toString();
        String body = exchange.getBody();
        System.out.println(statusCode);
        System.out.println(statusCodeValue);
        System.out.println(storeNumber);
        System.out.println(body);
        JSONObject parse = JSON.parseObject(body);
        List<List> message = (List<List>)parse.get("b");
        return body;
    }
}
