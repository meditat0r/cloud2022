package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author meditat0r
 * @create 2022/1/18 9:44
 */
@RestController
@Slf4j
@RequestMapping(value = "/payment")
public class OrderNacosController {

    @Value("${service-url.nacos-user-service}")
    private String serverUrl;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/get/{id}")
    public String paymentInfo(@PathVariable("id") Long id){
        return restTemplate.getForObject(serverUrl + "/payment/get/" + id, String.class);
    }

}
