package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: lhm
 * @Date: 2020/10/16 16:31
 * 4
 */
@SpringBootApplication
@EnableDiscoveryClient  //该注解用于consul或者zookeeper作为注册中心
public class Payment8004Application {
    public static void main(String[] args){
        SpringApplication.run(Payment8004Application.class,args);
    }
}
