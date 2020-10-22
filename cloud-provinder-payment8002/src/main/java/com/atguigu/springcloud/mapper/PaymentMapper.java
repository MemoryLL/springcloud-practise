package com.atguigu.springcloud.mapper;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: lhm
 * @Date: 2020/10/14 0:05
 * 4
 */
@Mapper
public interface PaymentMapper {
    public int save(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
