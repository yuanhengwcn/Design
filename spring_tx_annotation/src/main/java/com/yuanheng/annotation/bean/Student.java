package com.yuanheng.annotation.bean;

import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.annotation.bean
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-13 16:04
 */

//@Component()中的value值，代表生成的这个对象，叫什么名字
@Component(value = "aa")

//@Scope给值，表示是单例还是多例
@Scope(value = "prototype")

@Data
public class Student {

    //@Value:只能注入基本类型和字符串
    @Value("1001")
    private Integer id;

    @Value("张三")
    private String name;

    @Value("男")
    private String gender;



    // @Autowired//根据类型需要从Spring容器中获取一个同类型的对象
    // @Qualifier(value = "a1")//指定对象的名称进行注入
    //@Resource相当于上面两个注解的和。
    //@Resource(name = "a2")//根据属性的名称从Spring容器中获取该对象,name表示从Spring容器中获取指定的名称对象


    @Resource(name = "a2")//这个爆红，需要导入依赖javax.annotation-api
    private Address address;
}
