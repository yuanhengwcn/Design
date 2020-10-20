package com.yuanheng.mybatis.relation.pojo;

import lombok.Data;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.mybatis.relation.pojo
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-20 14:44
 */

@Data
public class Employee {

    private Integer employeeId;

    private String lastName;

    private String email;

    private Integer departmentId;

    private Department department;
}
