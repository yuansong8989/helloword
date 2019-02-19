package com.springboot.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yzd on 2019/1/18.
 */
@Component
public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        //获取请求的url
//        String uri = request.getRequestURI();
//        if (uri.indexOf("/login") >= 0) {
//            System.out.print("地址输入正确，放行");
//            return true;
//        }
//        else{
//            return false;
//        }
        System.out.println("进入自定义拦截器。。。。。");
        String token = request.getHeader("token");
        String url=request.getRequestURI();
        if (!StringUtils.isEmpty(token)) {
            if (token.equals("123")) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }
}
