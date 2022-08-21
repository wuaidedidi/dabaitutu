package com.lichen.dabaitutu.system.service.impl;

import com.lichen.dabaitutu.system.entity.Job;
import com.lichen.dabaitutu.system.mapper.JobMapper;
import com.lichen.dabaitutu.system.service.IJobService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 定时任务表 服务实现类
 * </p>
 *
 * @author lichen
 * @since 2022-08-21
 */
@Service
public class JobServiceImpl extends ServiceImpl<JobMapper, Job> implements IJobService {

}
