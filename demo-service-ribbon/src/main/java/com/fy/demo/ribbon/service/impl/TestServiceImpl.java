package com.fy.demo.ribbon.service.impl;

import com.fy.demo.ribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ya.fang on 2017/10/16.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String addService(Integer a, Integer b) {
        String url = "http://DEMO-EUREKA-CLIENT/add?a="+ a + "&b=" + b;
        return restTemplate.getForObject(url,String.class);
    }
}
