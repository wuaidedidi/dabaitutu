package com.lichen.dabaitutu.common.service;


import com.lichen.dabaitutu.common.entity.DabaituConstant;
import com.lichen.dabaitutu.common.exception.DabaituException;
import com.lichen.dabaitutu.common.properties.DabaituProperties;
import com.lichen.dabaitutu.common.utils.HttpContextUtil;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;



/**
 * @author lichen
 * @version 1.0.0
 * @className CodeValidateService.java
 * @Description TODO
 * @createTime 2022年08月19日 20:29:00
 */
@RequiredArgsConstructor
@Service
public class CodeValidateService {

    private final DabaituProperties properties;
    private RedisService redisService;

    @Value("${" + DabaituProperties.ENABLE_REDIS_CACHE + "}")
    private boolean enableRedisCache;

    /**
     * 验证码判断 分辨判断空 过期以及验证码错误
     * 分为redis 和session模式进行判断
     *
     * @param key 键
     * @param value
     */
    public void check(String key, String value) {
        if (StringUtils.isBlank(value)) {
            throw new DabaituException("请输入验证码");
        }
        String codeKey = DabaituConstant.VALIDATA_CODE_PREFIX + key;

        if (enableRedisCache) {
            Object codeInRedis = redisService.get(codeKey);
            if (codeInRedis == null) {
                throw new DabaituException("验证码已过期");
            }
            if (StringUtils.equalsIgnoreCase(value, String.valueOf(codeInRedis))) {
                throw new DabaituException("验证码错误");
            }

        } else {
            HttpServletRequest request = HttpContextUtil.getHttpServletRequest();
            HttpSession session = request.getSession();
            String validateCodeTimeSessionKey = DabaituConstant.VALIDATE_CODE_TIME_PREFIX + "key";
            Object codeInSession = session.getAttribute(codeKey);
            LocalDateTime timeInSession = (LocalDateTime) session.getAttribute(validateCodeTimeSessionKey);
            try {
                if (null==timeInSession || LocalDateTime.now().isAfter(timeInSession)) {
                    throw new DabaituException("验证码已过期");
                }
                if (StringUtils.equalsIgnoreCase(value, String.valueOf(codeInSession))) {
                    throw new DabaituException("验证码错误");
                }
            } finally {
                session.removeAttribute(codeKey);
                session.removeAttribute(validateCodeTimeSessionKey);
            }

        }
    }
}
