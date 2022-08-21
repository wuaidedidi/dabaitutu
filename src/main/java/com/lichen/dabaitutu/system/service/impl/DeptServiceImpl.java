package com.lichen.dabaitutu.system.service.impl;

import com.lichen.dabaitutu.system.entity.Dept;
import com.lichen.dabaitutu.system.mapper.DeptMapper;
import com.lichen.dabaitutu.system.service.IDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author lichen
 * @since 2022-08-21
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
