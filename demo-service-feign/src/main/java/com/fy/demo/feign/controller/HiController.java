package com.fy.demo.feign.controller;

import com.fy.demo.feign.service.EurekaServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ya.fang on 2017/10/16.
 */
@Controller
public class HiController {
    @Autowired
    private EurekaServerService eurekaServerService;

    @ResponseBody
    @RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.GET)
    public Object add(@PathVariable("a")Integer a, @PathVariable("b")Integer b){
        return eurekaServerService.addFromClientOne(a,b);
    }
}
