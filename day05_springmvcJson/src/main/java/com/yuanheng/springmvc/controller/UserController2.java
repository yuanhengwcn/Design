package com.yuanheng.springmvc.controller;

import com.yuanheng.springmvc.pojo.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.springmvc.controller
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-15 17:43
 */
@RestController
public class UserController2 {

    @RequestMapping(value = "/save")
    //从JSON字符串（注意不是JSON对象）转变成为User对象
    public String save(@RequestBody User user){
        System.out.println(user);
        return "ok";
    }
}
