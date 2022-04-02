package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Order;;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Author meditat0r
 * @create 2022/1/26 15:19
 */
public interface OrderService extends IService<Order> {
    CommonResult create(Order order);
}
