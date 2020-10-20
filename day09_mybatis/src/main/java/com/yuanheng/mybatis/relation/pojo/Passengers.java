package com.yuanheng.mybatis.relation.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.mybatis.relation.pojo
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-20 11:17
 */

@Data
public class Passengers {
    private Integer id;
    private String name;
    private String sex;
    private Date birthday;

    private Passports passports;
}
