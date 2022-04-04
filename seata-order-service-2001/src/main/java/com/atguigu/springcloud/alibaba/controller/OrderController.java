package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.alibaba.service.OrderService;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author meditat0r
 * @create 2022/1/26 16:00
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(@RequestBody Order order){
        orderService.create(order);
        return new CommonResult(0, "订单创建成功");
    }
}
