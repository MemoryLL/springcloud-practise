package com.atguigu.springcloud.fallback;

import com.atguigu.springcloud.client.PaymengHystrixClient;
import org.springframework.stereotype.Component;

/**
 * @Author: lhm
 * @Date: 2020/10/21 19:39
 * 4
 */
@Component
public class PaymentFallback implements PaymengHystrixClient {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-------PaymentFallback fall paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymengInfo_timeOut(Integer id) {
        return "-------PaymentFallback fall paymengInfo_timeOut,o(╥﹏╥)o";
    }
}
