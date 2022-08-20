package com.lichen.dabaitutu.common.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

import javax.validation.constraints.NotBlank;
/**
 * @author lichen
 * @version 1.0.0
 * @className MD5Util.java
 * @Description TODO
 * @createTime 2022年08月20日 17:42:00
 */
public class MD5Util {
    /**算法名**/
    private static  final String ALGORITHM_NAME="md5";
    /**hash*/
    private static  final int HASH_ITERATIONS=5;
    /**
     * 使用simpleHash
     * @param username
     * @param password
     * @return
     */
    public static String encrypt(String username,  String password) {
        String source=StringUtils.lowerCase(username);
        password=StringUtils.lowerCase(password);
       return new SimpleHash(ALGORITHM_NAME,password, ByteSource.Util.bytes(StringUtils.lowerCase(username)), HASH_ITERATIONS).toHex();
    }
}
