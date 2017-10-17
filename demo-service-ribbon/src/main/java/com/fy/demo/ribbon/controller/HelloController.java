package com.fy.demo.ribbon.controller;

import com.fy.demo.ribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ya.fang on 2017/10/16.
 */
@Controller
public class HelloController {

    @Autowired
    private TestService testService;

    @ResponseBody
    @RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.GET)
    public String add(@PathVariable("a")Integer a, @PathVariable("b")Integer b){
        return testService.addService(a,b);
    }
}
