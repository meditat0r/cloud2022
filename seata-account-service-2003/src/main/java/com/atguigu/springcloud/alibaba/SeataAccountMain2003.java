package com.atguigu.springcloud.alibaba;

import com.alibaba.cloud.seata.rest.SeataRestTemplateAutoConfiguration;
import com.atguigu.springcloud.alibaba.config.DataSourceProxyConfig;
import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;
/**
 * @Author meditat0r
 * @create 2022/4/3 12:01
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, SeataRestTemplateAutoConfiguration.class})
@EnableDiscoveryClient
@EnableAutoDataSourceProxy
@EnableFeignClients
@Import(DataSourceProxyConfig.class)
public class SeataAccountMain2003 {
    public static void main(String[] args) {
        SpringApplication.run(SeataAccountMain2003.class, args);
    }
}
