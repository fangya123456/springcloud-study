package com.fy.demo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by fangya on 2017/10/15.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DemoEurekaClientApplication {
    public static void main(String[] args){
        SpringApplication.run(DemoEurekaClientApplication.class, args);
    }
}
