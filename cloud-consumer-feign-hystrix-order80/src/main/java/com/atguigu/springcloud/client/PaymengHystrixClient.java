package com.atguigu.springcloud.client;

import com.atguigu.springcloud.fallback.PaymentFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: lhm
 * @Date: 2020/10/20 23:00
 * 4
 */
@Component
@FeignClient(value = "CLOUD-PROVINDER-HYSTRIX-PAYMENT",fallback = PaymentFallback.class)
public interface PaymengHystrixClient {

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymengInfo_timeOut(@PathVariable("id") Integer id);
}
