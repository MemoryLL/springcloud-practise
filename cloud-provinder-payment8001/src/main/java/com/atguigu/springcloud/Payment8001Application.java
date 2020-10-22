package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: lhm
 * @Date: 2020/10/13 23:49
 * 4
 */
@SpringBootApplication
@EnableEurekaClient
public class Payment8001Application {
    public static void main(String[] args){
        SpringApplication.run(Payment8001Application.class,args);
    }
}
