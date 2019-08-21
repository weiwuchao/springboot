package com.wwc.interceptor.interceptor;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionInterceptor implements HandlerInterceptor {

    // 在业务处理器处理请求之前被调用
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{

        String uri=request.getRequestURI();
        System.out.println(uri);
        if("/user/login".equals(uri) || "/user/login_view".equals(uri)){
            return true;
        }
        /*String loginSession=(String)request.getSession().getAttribute("userInfo");
        if(StringUtils.isEmpty(loginSession)){
            response.sendRedirect("/user/login_view");
            return false;
        }*/
        return true;
    }
    // 在业务处理器处理请求完成之后，生成视图之前执行
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception{
    }
    // 在DispatcherServlet完全处理完请求之后被调用，可用于清理资源
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception{
    }
}
