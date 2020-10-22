package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: lhm
 * @Date: 2020/10/22 16:40
 * 4
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWay9527Application {
    public static void main(String[] args){
        SpringApplication.run(GateWay9527Application.class,args);
    }
}
