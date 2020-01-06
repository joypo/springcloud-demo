package com.example.consumer.feign;

import com.example.consumer.feign.impl.ProducerFeignClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sunx
 * @date 2020-01-06
 * @description
 */
@FeignClient(value = "producer", fallback = ProducerFeignClientImpl.class)
public interface ProducerFeignClient {

    @RequestMapping("hello/index")
    String index();
}
