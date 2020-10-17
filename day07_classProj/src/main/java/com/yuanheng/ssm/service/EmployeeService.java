package com.yuanheng.ssm.service;

import com.github.pagehelper.PageInfo;
import com.yuanheng.ssm.po.Employee;
import com.yuanheng.ssm.po.MyEmployee;
import com.yuanheng.ssm.vo.EmployeeVO;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.ssm.service
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-16 19:40
 */
public interface EmployeeService {
    List<MyEmployee> list();

    PageInfo<MyEmployee> page(Integer pageNum, Integer pageSize);

    PageInfo<MyEmployee> page(EmployeeVO employeeVO, Integer page, Integer pageSize);

    boolean delete(Integer id);

    Employee get(Integer id);

    boolean update(Employee employee);
}
