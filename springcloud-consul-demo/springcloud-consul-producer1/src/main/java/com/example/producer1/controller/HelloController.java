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
@RequestMapping("hello")
@Slf4j
public class HelloController {

    @RequestMapping("index")
    public String index() {
        log.info("producer-111");
        return "index11";
    }
}
