package com.yuanheng.ssm.po;

import lombok.Data;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.ssm.po
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-16 21:10
 */

@Data
public class Job {
    private String jobId;
    private String jobTitle;
    private Integer maxSalary;
    private Integer minSalary;
}
