package com.lichen.dabaitutu.common.utils;

import com.lichen.dabaitutu.common.entity.DabaituConstant;
import lombok.With;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Pattern;

/**
 * @author lichen
 * @version 1.0.0
 * @className DabaituUtils.java
 * @Description TODO
 * @createTime 2022年08月19日 17:33:00
 */
public abstract class DabaituUtils {

    /***
     * 判断是否是Ajax请求
     * @param request
     * @return
     */
    public static boolean isAjaxRequest(HttpServletRequest request){
            return (request.getHeader("X-Requested-With")!=null &&
                    "XMLHttpRequest".equals(request.getHeader("X-Requested-With")));

    }

    public static String view(String viewName) {
        return DabaituConstant.VIEW_PREFIX+viewName;
    }

    /**
     *
     * 正则表达式消炎
     * @param regex 格式
     * @param value 值
     * @return
     */
    public static boolean match(String regex, String value) {

        Pattern pattern=Pattern.compile(regex);

        return pattern.matcher(value).matches();

    }
}
