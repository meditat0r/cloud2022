package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author meditat0r
 * @create 2022/1/3 19:22
 */
@RestController
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL = "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/save")
    public CommonResult<Payment> save(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }
}
