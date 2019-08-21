package com.wwc.helloboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldCtrl {

    @RequestMapping("/hello")
    public String hello(){
        return "hello springBoot";
    }
}

