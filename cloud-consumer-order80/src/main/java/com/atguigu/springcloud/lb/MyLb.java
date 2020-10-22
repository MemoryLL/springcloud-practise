package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: lhm
 * @Date: 2020/10/19 18:30
 */
@Component
public class MyLb implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private final int getAndIncrement() {
        int crurrent;
        int next;
        do {
            crurrent = this.atomicInteger.get();
            next = crurrent >= 2147483647 ? 0 : crurrent + 1;
        } while (!this.atomicInteger.compareAndSet(crurrent, next));
        System.out.println("*******第几次访问，次数next:" + next);
        return next;
    }

    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
