package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.mapper.AccountMapper;
import com.atguigu.springcloud.alibaba.service.AccountService;
import com.atguigu.springcloud.entities.Account;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @Author meditat0r
 * @create 2022/4/3 12:14
 */
@Service
@Slf4j
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {
    @Override
    public void decrease(long userId, BigDecimal money) {
        log.info("----->account-service 开始更新账户");
        Account account = this.getById(userId);
        account.setUsed(account.getUsed().add(money))
                .setResidue(account.getResidue().subtract(money));
        this.updateById(account);
        log.info("----->account-service 账户更新完成");
    }
}
