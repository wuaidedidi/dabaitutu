package com.lichen.dabaitutu.common.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @author lichen
 * @version 1.0.0
 * @className HttpContextUtil.java
 * @Description TODO
 * @createTime 2022年08月19日 22:48:00
 */
public class HttpContextUtil {



    public static HttpServletRequest getHttpServletRequest() {
        return ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();

    }
}
