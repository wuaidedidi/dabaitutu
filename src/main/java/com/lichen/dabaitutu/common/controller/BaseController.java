package com.lichen.dabaitutu.common.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;


/**
 * @author lichen
 * @version 1.0.0
 * @className BaseController.java
 * @Description TODO
 * @createTime 2022年08月20日 19:35:00
 */
public class BaseController {

    public Subject getSubject(){
        return SecurityUtils.getSubject();
    }
    public void login(AuthenticationToken token) {
        getSubject().login(token);
    }
}
