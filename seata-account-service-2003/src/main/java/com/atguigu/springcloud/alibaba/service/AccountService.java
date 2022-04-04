package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.entities.Account;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;

/**
 * @Author meditat0r
 * @create 2022/4/3 12:08
 */
public interface AccountService extends IService<Account> {
    void decrease(long userId, BigDecimal money);
}
