package com.atguigu.springcloud.alibaba.mapper;

import com.atguigu.springcloud.entities.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author meditat0r
 * @create 2022/1/26 15:16
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
