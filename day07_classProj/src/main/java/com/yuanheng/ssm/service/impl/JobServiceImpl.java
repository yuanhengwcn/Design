package com.yuanheng.ssm.service.impl;

import com.yuanheng.ssm.mapper.JobMapper;
import com.yuanheng.ssm.po.Job;
import com.yuanheng.ssm.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.ssm.service.impl
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-16 19:44
 */
@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobMapper jobMapper;

    @Override
    public List<Job> list() {
        return jobMapper.list();
    }
}
