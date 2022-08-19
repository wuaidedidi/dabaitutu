package com.lichen.dabaitutu.system.controller;

import com.lichen.dabaitutu.common.utils.DabaituUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lichen
 * @version 1.0.0
 * @className ViewController.java
 * @Description TODO
 * @createTime 2022年08月19日 17:08:00
 */
@Controller("systemView")
@RequiredArgsConstructor
public class ViewController {
        @GetMapping("/login")
        public Object Login(HttpServletRequest request){
            // 在写后台程序时，有时候需要知道客户端发送的是普通的请求，还是ajax 请求，
            // 至少在我目前所做的项目中有这样一个用途：如果session 过期的时候，如
            // 果是普通请求，跳转到登录页面，但如果是ajax 请求，如果后台session
            // 已经过期了，这时候会返回登陆界面的的html 代码作为ajax 的返回值，这样就很郁闷
            // ，不好处理，如果是ajax 请求，理想的方式是返回json给客户端，这样客户端就好处理.
            //         目前我采用了比较笨的一个方法来实现，可以在 请求的参数中加入一个标志来判断.
            // public class SessionIntecepter implements

            if(DabaituUtils.isAjaxRequest(request)){
                //调用shiro包的异常 缓存过期异常
                throw new RuntimeException();
            }else{
                ModelAndView modelAndView=new ModelAndView();
                modelAndView.setViewName(DabaituUtils.view("login"));
                return modelAndView;
            }


        }
}
