package com.fy.demo.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ya.fang on 2017/10/16.
 */
@FeignClient(value = "demo-eureka-client")
public interface EurekaServerService {

    @RequestMapping(value = "add", method = RequestMethod.GET)
    Object addFromClientOne(@RequestParam(value = "a")Integer a, @RequestParam(value = "b")Integer b);
}
