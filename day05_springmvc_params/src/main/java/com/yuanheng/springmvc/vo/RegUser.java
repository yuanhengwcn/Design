package com.yuanheng.springmvc.vo;

import lombok.Data;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.springmvc.vo
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-14 15:04
 */

@Data
public class RegUser {

    private String username;
    private String password;
    private String gender;
    private String[] hobby;
    private String address;

}
