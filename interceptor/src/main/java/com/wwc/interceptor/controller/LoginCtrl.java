package com.wwc.interceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/user")
public class LoginCtrl {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(HttpServletRequest request){

        String userName=request.getParameter("uaerName");
        String pwd=request.getParameter("password");
        String retStr="登录成功";
        if("admin".equals(userName) && "admin".equals(pwd)){
            request.getSession().setAttribute("userInfo",userName);
        }else{
             retStr="用户名或密码错误";
        }
        return retStr;
    }

    @RequestMapping(value = "/login_view",method = RequestMethod.GET)
    public String showLoginView(HttpServletRequest request){
        return "login";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(HttpServletRequest request){
        return "index";
    }
}
