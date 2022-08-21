package com.lichen.dabaitutu.system.service.impl;

import com.lichen.dabaitutu.system.entity.LoginLog;
import com.lichen.dabaitutu.system.mapper.LoginLogMapper;
import com.lichen.dabaitutu.system.service.ILoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录日志表 服务实现类
 * </p>
 *
 * @author lichen
 * @since 2022-08-21
 */
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements ILoginLogService {

}
