package com.yuanheng.layui.controller;

import com.yuanheng.layui.po.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.layui.controller
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-22 14:06
 */

@RestController
public class HelloController {

    @PostMapping("/form/add")
    public String add(@RequestBody Person person){
        System.out.println(person);
        return "ok";
    }

}
