package com.example.consumer.feign.impl;

import com.example.consumer.feign.ProducerFeignClient;
import org.springframework.stereotype.Component;

/**
 * @author sunx
 * @date 2020-01-06
 * @description
 */
@Component
public class ProducerFeignClientImpl implements ProducerFeignClient {
    @Override
    public String index() {
        return "熔断了";
    }
}
