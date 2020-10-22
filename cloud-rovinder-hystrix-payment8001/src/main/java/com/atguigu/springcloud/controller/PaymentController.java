package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lhm
 * @Date: 2020/10/20 17:57
 * 4
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String ServerPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String result = paymentService.paymentInfo_OK(id);
        log.info("******result: "+result);
        return result;
    }


    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymengInfo_timeOut(@PathVariable("id") Integer id){
        int age = 10/0;
        String result = paymentService.paymengInfo_timeOut(id);
        log.info("******result: "+result);
        return result;
    }

    @GetMapping("/payment/circuit/{id}")
    public String paymengCircuit(@PathVariable("id") Integer id){
        String result = paymentService.paymentCircuitBreaker(id);
        log.info("******result: "+result);
        return result;
    }


}
