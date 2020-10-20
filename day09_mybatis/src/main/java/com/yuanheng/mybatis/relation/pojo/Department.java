package com.yuanheng.mybatis.relation.pojo;

import lombok.Data;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.mybatis.relation.pojo
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-20 14:42
 */

@Data
public class Department {

    private Integer departmentId;

    private String departmentName;

    private String managerId;

    private Integer locationId;

    private List<Employee> employees;

}
