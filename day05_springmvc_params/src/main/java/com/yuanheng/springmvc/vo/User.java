package com.yuanheng.springmvc.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.springmvc.vo
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-14 15:04
 */

@Data
public class User {

    private Integer id;
    private String name;
    private Integer age;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;

    private String[] hobby;

}
