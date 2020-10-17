package com.yuanheng.ssm.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.ssm.po
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-16 19:57
 */

@Data
public class Employee {
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date hireDate;
    private String jobId;
    private Integer salary;
    private Double comm;
    private Integer managerId;
    private Integer departmentId;
    private String pic;
}
