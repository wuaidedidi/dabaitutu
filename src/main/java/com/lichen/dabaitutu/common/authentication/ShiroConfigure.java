package com.lichen.dabaitutu.common.authentication;

import lombok.RequiredArgsConstructor;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.lang.Nullable;

/**
 * @author lichen
 * @version 1.0.0
 * @className ShiroConfigure.java
 * @Description TODO
 * @createTime 2022年08月20日 21:46:00
 */
@Configuration
@RequiredArgsConstructor
public class ShiroConfigure {
    /**
     * remember key
     * 生成方式：
     * String encryptKey = RandomStringUtils.randomAlphanumeric(15);
     * byte[] encryptKeyBytes = encryptKey.getBytes(StandardCharsets.UTF_8);
     * String rememberKey = Base64Utils.encodeToString(Arrays.copyOf(encryptKeyBytes, 16));
     */
    private final static String REMEMBER_ME_KEY = "M1RIN2FVNGt6T2lRU2VNAA==";



    // @Bean
    // public DefaultWebSecurityManager securityManager(ShiroRealm shiroRealm,
    //                                                  @Nullable RedisCacheManager redisCacheManager,
    //                                                  @Nullable EhCacheManager ehCacheManager,
    //                                                  DefaultWebSessionManager sessionManager) {
    //     DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
    //     // 配置 SecurityManager，并注入 shiroRealm
    //     securityManager.setRealm(shiroRealm);
    //     // 配置 shiro session管理器
    //     securityManager.setSessionManager(sessionManager);
    //     // 配置 缓存管理类 cacheManager
    //     securityManager.setCacheManager(redisCacheManager != null ? redisCacheManager : ehCacheManager);
    //     // 配置 rememberMeCookie
    //     securityManager.setRememberMeManager(rememberMeManager());
    //     return securityManager;
    // }
}
