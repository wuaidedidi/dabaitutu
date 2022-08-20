package com.lichen.dabaitutu.system.controller;

import com.lichen.dabaitutu.common.controller.BaseController;
import com.lichen.dabaitutu.common.entity.DabaituResponse;
import com.lichen.dabaitutu.common.properties.DabaituProperties;
import com.lichen.dabaitutu.common.service.CodeValidateService;
import com.lichen.dabaitutu.common.utils.MD5Util;
import lombok.RequiredArgsConstructor;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotBlank;

/**
 * @author lichen
 * @version 1.0.0
 * @className LoginController.java
 * @Description TODO
 * @createTime 2022年08月19日 13:44:00
 */
@Validated
@RestController
@RequiredArgsConstructor
public class LoginController extends BaseController {

    private final CodeValidateService codeValidateService;
    private final DabaituProperties properties;
        @PostMapping("/login")
        public DabaituResponse login(
                @NotBlank(message = "{required}") String username,
                @NotBlank(message = "{required}") String password,
                @NotBlank(message = "{required}") String verifyCode,
                boolean remeberMe,
                HttpServletRequest request){
            // //校验验证码
            // codeValidateService.check(request.getSession().getId(),verifyCode);
            //密码加密
            UsernamePasswordToken token=new UsernamePasswordToken(username,
                    MD5Util.encrypt(username.toLowerCase(),password),remeberMe);
            //shiro登陆保存
            super.login(token);
            //保存登陆日志暂时不写
            return new DabaituResponse().success().data(properties.getShiro().getSuccessUrl());
        }
}

