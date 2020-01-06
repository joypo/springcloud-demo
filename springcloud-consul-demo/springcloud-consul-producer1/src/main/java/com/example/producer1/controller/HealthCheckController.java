package com.example.producer1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunx
 * @date 2020-01-06
 * @description
 */
@RestController
@RequestMapping
@Slf4j
public class HealthCheckController {
    @RequestMapping("test")
    public void test() {
        log.info("111---健康检查");
    }
}
