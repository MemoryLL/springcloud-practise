package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @Author: lhm
 * @Date: 2020/10/14 0:28
 * 4
 */
public interface PaymentService {
    public int save(Payment payment);
    public Payment getPaymentById(Long id);
}
