package com.lichen.dabaitutu.system.service.impl;

import com.lichen.dabaitutu.system.entity.Role;
import com.lichen.dabaitutu.system.mapper.RoleMapper;
import com.lichen.dabaitutu.system.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author lichen
 * @since 2022-08-21
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
