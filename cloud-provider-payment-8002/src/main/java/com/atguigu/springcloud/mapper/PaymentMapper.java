package com.atguigu.springcloud.mapper;

import com.atguigu.springcloud.entities.Payment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author meditat0r
 * @create 2021/12/31 10:11
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment>{
}
