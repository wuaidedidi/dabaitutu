package com.lichen.dabaitutu.system.controller;

import com.lichen.dabaitutu.common.entity.DabaituResponse;
import com.lichen.dabaitutu.common.service.CodeValidateService;
import lombok.RequiredArgsConstructor;
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
public class LoginController {

    private final CodeValidateService codeValidateService;

        @PostMapping("/login")
        public DabaituResponse login(
                @NotBlank(message = "{required}") String username,
                @NotBlank(message = "{required}") String password,
                @NotBlank(message = "{required}") String verifyCode,
                boolean remeberMe,
                HttpServletRequest request){
            codeValidateService.check(request.getSession().getId(),verifyCode);
            return new DabaituResponse().success().data("大白兔");
        }
}
