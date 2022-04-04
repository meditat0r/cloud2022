package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.mapper.OrderMapper;
import com.atguigu.springcloud.alibaba.service.AccountService;
import com.atguigu.springcloud.alibaba.service.OrderService;
import com.atguigu.springcloud.alibaba.service.StorageService;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Order;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author meditat0r
 * @create 2022/1/26 15:19
 */
@Service
@Slf4j
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Resource
    private OrderMapper orderMapper;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    @Override
    @GlobalTransactional
    public CommonResult create(Order order) {
        log.info("----->开始新建订单");
        this.save(order);
        log.info("----->调整库存数量");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("----->处理账户信息");
        accountService.decrease(order.getUserId(), order.getMoney());

        log.info("----->修改订单状态");
        this.updateById(order.setState(1));
        return null;
    }
}
