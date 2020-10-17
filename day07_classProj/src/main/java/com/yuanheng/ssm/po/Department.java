package com.yuanheng.ssm.po;

import lombok.Data;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.ssm.po
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-16 21:18
 */

@Data
public class Department {
    private Integer departmentId;
    private String departmentName;
    private String managerId;
    private String locationId;
}
