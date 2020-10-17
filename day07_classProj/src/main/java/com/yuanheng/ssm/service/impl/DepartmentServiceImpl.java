package com.yuanheng.ssm.service.impl;

import com.yuanheng.ssm.mapper.DepartmentMapper;
import com.yuanheng.ssm.po.Department;
import com.yuanheng.ssm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.ssm.service.impl
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-16 19:43
 */

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> list() {
        return departmentMapper.list();
    }
}
