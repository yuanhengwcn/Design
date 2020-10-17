package com.yuanheng.ssm.mapper;

import com.yuanheng.ssm.po.Employee;
import com.yuanheng.ssm.po.MyEmployee;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.ssm.mapper
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-16 19:48
 */
public interface EmployeeMapper {
    List<MyEmployee> list();

    List<MyEmployee> search(Employee employee);

    int delete(Integer id);

    Employee get(Integer id);

    int update(Employee employee);
}
