package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.mapper.StorageMapper;
import com.atguigu.springcloud.alibaba.service.StorageService;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Storage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author meditat0r
 * @create 2022/4/3 12:28
 */
@Service
@Slf4j
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements StorageService {
    @Override
    public void decrease(Long productId, Integer count) {
        log.info("----->storage-service 开始扣减库存");
        Storage storage = this.getById(productId);
        storage.setUsed(storage.getUsed() + count)
                .setResidue(storage.getResidue() - count);
        this.updateById(storage);
        log.info("----->storage-service 扣减库存完成");
    }
}
