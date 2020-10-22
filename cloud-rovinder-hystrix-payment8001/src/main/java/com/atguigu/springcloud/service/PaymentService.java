package com.atguigu.springcloud.service;

/**
 * @Author: lhm
 * @Date: 2020/10/20 17:58
 * 4
 */
public interface PaymentService {
    public String paymentInfo_OK(Integer id);
    public String paymengInfo_timeOut(Integer id);
    public String paymentCircuitBreaker(Integer id);
}
