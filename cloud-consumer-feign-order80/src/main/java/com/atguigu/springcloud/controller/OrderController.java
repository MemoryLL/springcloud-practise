package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.client.PaymentClient;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lhm
 * @Date: 2020/10/19 21:26
 * 4
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    private PaymentClient paymentClient;

    @GetMapping("/consumer/payment/save")
    public CommonResult<Payment> save(Payment payment){
        return paymentClient.save(payment);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
       return paymentClient.getPaymentById(id);
    }

}
