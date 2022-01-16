package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author meditat0r
 * @create 2022/1/16 21:39
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator1(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("path_route1", r -> r.path("/guonei").uri("https://news.baidu.com/guonei")).build();
        return routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("path_route2", r -> r.path("/guoji").uri("https://news.baidu.com/guoji")).build();
        return routes.build();
    }
}
