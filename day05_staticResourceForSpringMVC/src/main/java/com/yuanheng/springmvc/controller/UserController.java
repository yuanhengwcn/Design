package com.yuanheng.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.springmvc.controller
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-14 19:56
 */
@Controller
public class UserController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
