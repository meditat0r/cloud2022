package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author meditat0r
 * @create 2022/1/17 17:13
 */
@RestController
@RequestMapping(value = "/payment")
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/get/{id}")
    public String getPayment(@PathVariable("id") Long id){
        return "Hello Nacos Discovery, serverPort:" + serverPort + "\t id:" + id;
    }
}
