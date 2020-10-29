package com.yuanheng.springmvc.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.yuanheng.springmvc.MySerializer;
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

    @JsonProperty("username")
    private String name;

    @JsonIgnore
    private Integer age;

    private String gender;

    @JsonSerialize(using = MySerializer.class)
    private String desc;

    //不包含空的
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String hobby;


}
