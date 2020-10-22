package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: lhm
 * @Date: 2020/10/16 17:20
 * 4
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZk80Application {
    public static void main(String[] args){
        SpringApplication.run(OrderZk80Application.class,args);
    }
}
