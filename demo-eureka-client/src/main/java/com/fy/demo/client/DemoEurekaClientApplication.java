package com.fy.demo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by fangya on 2017/10/15.
 */
//激活注册提供服务的客户端使用注解 @EnableDiscoveryClient 或 @EnableEurekaClient
@EnableEurekaClient
@SpringBootApplication
public class DemoEurekaClientApplication {
    public static void main(String[] args){
        SpringApplication.run(DemoEurekaClientApplication.class, args);
    }
}
