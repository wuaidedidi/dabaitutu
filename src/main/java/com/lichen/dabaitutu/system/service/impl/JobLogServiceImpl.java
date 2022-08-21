package com.lichen.dabaitutu.system.service.impl;

import com.lichen.dabaitutu.system.entity.JobLog;
import com.lichen.dabaitutu.system.mapper.JobLogMapper;
import com.lichen.dabaitutu.system.service.IJobLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 调度日志表 服务实现类
 * </p>
 *
 * @author lichen
 * @since 2022-08-21
 */
@Service
public class JobLogServiceImpl extends ServiceImpl<JobLogMapper, JobLog> implements IJobLogService {

}
