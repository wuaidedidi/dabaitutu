package com.lichen.dabaitutu.common.service;


import com.lichen.dabaitutu.common.entity.DabaituConstant;
import com.lichen.dabaitutu.common.exception.DabaituException;
import com.lichen.dabaitutu.common.properties.DabaituProperties;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Properties;


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
    @Value("${"+DabaituProperties.ENABLE_REDIS_CACHE+"}")
    private boolean enableRedisCache;
    /**
     * 验证码判断 分辨判断空 过期以及验证码错误
     * 分为redis 和session模式进行判断
     * @param key
     * @param value
     */
    public void check(String key,String value) {
        if(StringUtils.isBlank(value)){
            throw  new DabaituException("请输入验证码");
        }
        String codeKey= DabaituConstant.VALIDATA_CODE_PREFIX+key;

        if(enableRedisCache){
            System.out.println();
        }else{
            System.out.println();
        }
    }
}
