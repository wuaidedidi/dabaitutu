package com.lichen.dabaitutu.system.service.impl;

import com.lichen.dabaitutu.system.entity.User;
import com.lichen.dabaitutu.system.mapper.UserMapper;
import com.lichen.dabaitutu.system.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author lichen
 * @since 2022-08-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


    @Override
    public void doGetUserAuthorizationInfo(User user) {

    }
}
