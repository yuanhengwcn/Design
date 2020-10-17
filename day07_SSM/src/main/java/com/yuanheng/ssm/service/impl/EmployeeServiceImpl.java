package com.yuanheng.ssm.service.impl;

import com.yuanheng.ssm.mapper.EmployeeMapper;
import com.yuanheng.ssm.po.Employee;
import com.yuanheng.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.ssm.service.impl
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-16 12:09
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> list() {
        return employeeMapper.list();
    }
}
