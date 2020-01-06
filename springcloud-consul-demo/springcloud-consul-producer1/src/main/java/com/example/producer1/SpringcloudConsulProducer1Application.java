package com.example.producer1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudConsulProducer1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsulProducer1Application.class, args);
    }

}
