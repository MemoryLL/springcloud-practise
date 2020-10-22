package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: lhm
 * @Date: 2020/10/21 20:57
 * 4
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard9001Application {
    public static void main(String[] args){
        SpringApplication.run(HystrixDashboard9001Application.class,args);
    }
}
