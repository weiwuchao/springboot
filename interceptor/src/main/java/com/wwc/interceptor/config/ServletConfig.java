package com.wwc.interceptor.config;

import com.wwc.interceptor.InterceptorApplication;
import com.wwc.interceptor.servlet.TestServlet;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {

    /**
     * 第一种方式注册Servlet
     */
   /*@Bean
   public ServletRegistrationBean servletRegistrationBean(){
       return new ServletRegistrationBean(new TestServlet(),"/test");
   }*/
}
