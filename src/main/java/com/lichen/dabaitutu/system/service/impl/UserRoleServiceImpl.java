package com.lichen.dabaitutu.system.service.impl;

import com.lichen.dabaitutu.system.entity.UserRole;
import com.lichen.dabaitutu.system.mapper.UserRoleMapper;
import com.lichen.dabaitutu.system.service.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色关联表 服务实现类
 * </p>
 *
 * @author lichen
 * @since 2022-08-21
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
