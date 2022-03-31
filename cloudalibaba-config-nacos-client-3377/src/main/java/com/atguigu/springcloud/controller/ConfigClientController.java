package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author meditat0r
 * @create 2022/1/18 10:41
 * @RefreshScope 支持Nacos的动态刷新功能，实现配置自动更新
 */
@RestController
@RefreshScope
@Slf4j
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    /**
     * 读取nacos配置中心的config.info
     * @return
     */
    @GetMapping(value = "/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}
