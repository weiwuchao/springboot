package com.wwc.interceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//第二种用注解的方式注册Servlet
@ServletComponentScan
public class InterceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterceptorApplication.class, args);
    }

}
