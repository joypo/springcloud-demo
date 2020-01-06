package com.example.consumer.controller;

import com.example.consumer.feign.ProducerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunx
 * @date 2020-01-06
 * @description
 */
@RestController
@RequestMapping("home")
public class HomeController {

    @Autowired
    private ProducerFeignClient producerFeignClient;

    @GetMapping("index")
    public String index() {
        return producerFeignClient.index();
    }
}
