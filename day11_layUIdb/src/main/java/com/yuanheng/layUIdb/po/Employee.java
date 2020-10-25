package com.yuanheng.layUIdb.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.layUIdb.po
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-22 19:40
 */

/*
    因为忘加@Data注解，导致拿不到数据，浏览器检查Request URL: http://localhost:8080/employee/list?page=1&limit=10
    报500
    原因在Mapper层进行填充到Employee对象的时候，没有get方法
    测试显示，没有set方法可以进行填充，没有get方法不行

    显示500的原因有多种：
    1. 没有get方法
    2. 属性名错误
    3. mapper给出的字段名，类中缺少对应的字段
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
