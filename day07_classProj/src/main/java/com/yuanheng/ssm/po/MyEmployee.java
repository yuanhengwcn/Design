package com.yuanheng.ssm.po;

import lombok.Data;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.ssm.po
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-16 19:45
 */

@Data
public class MyEmployee extends Employee{
    private String jobTitle;
    private String managerName;
    private String departmentName;
}
