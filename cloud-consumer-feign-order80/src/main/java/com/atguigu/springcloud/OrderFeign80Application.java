package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: lhm
 * @Date: 2020/10/19 21:19
 * 4
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.atguigu.springcloud.client")
public class OrderFeign80Application {
    public static void main(String[] args){
        SpringApplication.run(OrderFeign80Application.class,args);
    }
}
