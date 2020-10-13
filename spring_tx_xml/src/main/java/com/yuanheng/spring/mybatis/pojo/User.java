package com.yuanheng.spring.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.spring.mybatis.pojo
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-13 11:35
 */


@Data //get/set
@ToString //toString方法
@NoArgsConstructor//空构函数
@AllArgsConstructor//带参数的构造函数
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String gender;
    private String hobby;
    private String address;
    private Date birthday;
    private String pic;
}

