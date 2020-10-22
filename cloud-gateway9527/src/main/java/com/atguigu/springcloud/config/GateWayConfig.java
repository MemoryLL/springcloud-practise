package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: lhm
 * @Date: 2020/10/22 17:02
 * 4
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLoactor(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route1",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();
        routes.route("path_route2",
                r -> r.path("/guoji")
                        .uri("http://news.baidu.com/guoji")).build();
        routes.route("path_route3",
                r -> r.path("/sports")
                        .uri("http://news.baidu.com/sports")).build();
        return routes.build();
    }
}
