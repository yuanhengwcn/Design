package com.yuanheng.mybatis.relation.mapper;

import com.yuanheng.mybatis.relation.pojo.Employee;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.mybatis.relation.mapper
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-20 14:47
 */
public interface EmployeeMapper {

    Employee findById(Integer id);

}
