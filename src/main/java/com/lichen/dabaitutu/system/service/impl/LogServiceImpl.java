package com.lichen.dabaitutu.system.service.impl;

import com.lichen.dabaitutu.system.entity.Log;
import com.lichen.dabaitutu.system.mapper.LogMapper;
import com.lichen.dabaitutu.system.service.ILogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志表 服务实现类
 * </p>
 *
 * @author lichen
 * @since 2022-08-21
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements ILogService {

}
