package com.yuanheng.layUIdb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuanheng.layUIdb.mapper.EmployeeMapper;
import com.yuanheng.layUIdb.po.Employee;
import com.yuanheng.layUIdb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.layUIdb.service.impl
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-22 19:51
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public PageInfo<Employee> page(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Employee> list = employeeMapper.list();
        if(list.size() > 0){
            return new PageInfo<>(list);
        }
        return null;
    }
}
