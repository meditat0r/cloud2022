package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author meditat0r
 * @create 2022/1/20 10:05
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        return "===testA===";
    }

    @GetMapping("/testB")
    public String testB(){
        return "===testB===";
    }
}
