package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: lhm
 * @Date: 2020/10/20 22:58
 * 4
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrix80Application {
    public static void main(String[] args){
        SpringApplication.run(OrderHystrix80Application.class,args);
    }
}
