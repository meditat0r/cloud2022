package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.entities.Storage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Author meditat0r
 * @create 2022/4/3 12:27
 */
public interface StorageService extends IService<Storage> {
    void decrease(Long productId, Integer count);
}
