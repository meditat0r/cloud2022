package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author meditat0r
 * @create 2021/12/31 10:34
 */
@RestController
@Slf4j
@RequestMapping(value = "/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping
    public CommonResult save(@RequestBody Payment payment){
        boolean flag = paymentService.save(payment);
        log.info("serverPort:" + serverPort);
        if(flag){
            return new CommonResult(0, "插入成功");
        }else{
            return new CommonResult(1, "插入失败,payment="+payment);
        }
    }

    @GetMapping(value = "/get/{id}")
    public CommonResult getById(@PathVariable Long id){
        Payment payment = paymentService.getById(id);
        log.info("serverPort:" + serverPort + ",查询结果："+payment);
        if(payment != null) {
            return new CommonResult(0, "查询成功", payment);
        }else{
            return new CommonResult(1, "查询失败,id="+id);
        }
    }
}
