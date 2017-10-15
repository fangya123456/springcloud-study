package com.example.demo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by fangya on 2017/10/15.
 */
@EnableEurekaServer
@SpringBootApplication
public class DemoEurekaServerApplication {

    public static void main(String[] args){
        SpringApplication.run(DemoEurekaServerApplication.class,args);
    }
}
