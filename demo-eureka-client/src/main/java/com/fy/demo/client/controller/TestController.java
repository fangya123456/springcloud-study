package com.fy.demo.client.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by fangya on 2017/10/15.
 */
@Controller
public class TestController {
    private final static Logger log = Logger.getLogger(TestController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Object add(@RequestParam Integer a, @RequestParam Integer b){
        log.info("注册成功......");
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        Integer r = a + b;
        log.info("/add, host:" + serviceInstance.getHost() + ",service_id" + serviceInstance.getServiceId() + ", result:" + r);
        return r;
    }
}
