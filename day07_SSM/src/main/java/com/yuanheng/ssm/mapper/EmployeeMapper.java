package com.yuanheng.ssm.mapper;

import com.yuanheng.ssm.po.Employee;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.ssm.mapper
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-16 12:12
 */
public interface EmployeeMapper {
    List<Employee> list();
}
