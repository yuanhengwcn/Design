package com.yuanheng.aop2.beans;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.aop2.beans
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-12 21:53
 */
public class Student {
    private Integer id;
    private String name;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public void init(){
        System.out.println("init方法被调用");
    }

    public void study(){
        System.out.println("好好学习天天向上");
    }
}
