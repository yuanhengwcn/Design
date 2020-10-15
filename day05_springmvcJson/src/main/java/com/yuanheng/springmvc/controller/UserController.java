package com.yuanheng.springmvc.controller;

import com.yuanheng.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.springmvc.controller
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-14 21:01
 */
@Controller
public class UserController {
    @ResponseBody
    @RequestMapping("/get")
    public User get(){
        User user = new User();
        user.setId(1001);
        user.setName("文文兄");
        user.setGender("男");
        return user;
    }
}
