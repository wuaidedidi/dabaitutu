package com.lichen.dabaitutu.common.properties;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author lichen
 * @version 1.0.0
 * @className FebsProperties.java
 * @Description TODO
 * @createTime 2022年08月19日 21:36:00
 */
@Data
@SpringBootConfiguration(proxyBeanMethods = false)
//读取配置文件
@ConfigurationProperties(prefix = DabaituProperties.PROPERTIES_PREFIX)
public class DabaituProperties {

    public static final String PROPERTIES_PREFIX = "dabaitu";
    public static final String ENABLE_REDIS_CACHE = "dabaitu.enable-redis-cache";

    private ShiroProperties shiro = new ShiroProperties();
    /**
     * 是否开启Redis缓存，true开启，false关闭
     * 为false时，采用基于内存的ehcache缓存
     */
    private boolean enableRedisCache;
}
