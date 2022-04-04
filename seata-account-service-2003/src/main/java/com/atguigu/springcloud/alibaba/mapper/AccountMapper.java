package com.atguigu.springcloud.alibaba.mapper;

import com.atguigu.springcloud.entities.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author meditat0r
 * @create 2022/4/3 12:07
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {
}
