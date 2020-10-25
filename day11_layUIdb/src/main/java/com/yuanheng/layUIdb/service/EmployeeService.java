package com.yuanheng.layUIdb.service;

import com.github.pagehelper.PageInfo;
import com.yuanheng.layUIdb.po.Employee;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.layUIdb.service
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-22 19:50
 */
public interface EmployeeService {
    PageInfo<Employee> page(Integer page, Integer limit);
}
