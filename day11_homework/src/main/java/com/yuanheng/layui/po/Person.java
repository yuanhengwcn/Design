package com.yuanheng.layui.po;

import lombok.Data;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.layui.po
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-22 14:00
 */

@Data
public class Person {
    private  String title;
    private  String password;
    private  Integer city;
    private  String[] like;
    private  String sex;
    private  String desc;
}
