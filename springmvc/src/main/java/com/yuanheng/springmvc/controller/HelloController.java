package com.yuanheng.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.springmvc.controller
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-13 17:56
 */

//在springmvc中配置了扫描语句，扫到了这里的@Controller注解
//<context:component-scan base-package="com.yuanheng.springmvc.controller"/>
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        System.out.println("Model层处理数据");
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        //如果不在springmvc中配置视图解析器，想要访问login就必须输入jsp/login.jsp
        return "login";
    }
}
