package com.lichen.dabaitutu.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lichen.dabaitutu.system.entity.User;

/**
 * @author lichen
 * @version 1.0.0
 * @className IUserService.java
 * @Description TODO
 * @createTime 2022年08月20日 23:06:00
 */
public interface IUserService extends IService<User>{
    /**
     * 获取用户角色和权限集
     *
     * @param user 用户
     */
    void doGetUserAuthorizationInfo(User user);
}
