package com.yuanheng.springmvc.pojo;

import lombok.Data;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.springmvc.pojo
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-14 21:02
 */
@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
}
