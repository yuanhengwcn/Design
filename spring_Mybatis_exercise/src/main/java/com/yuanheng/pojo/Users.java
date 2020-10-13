package com.yuanheng.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.pojo
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-12 23:33
 */

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private Integer id;
    private String username;
    private String password;
    private String gender;
    private String hobby;
    private String address;
    private Date birthday;
    private String pic;

}
