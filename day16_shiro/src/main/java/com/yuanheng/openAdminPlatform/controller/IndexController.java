package com.yuanheng.openAdminPlatform.controller;

import com.yuanheng.openAdminPlatform.pojo.AdminUser;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.openAdminPlatform.controller
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-29 15:43
 */

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }


    @ResponseBody
    @RequestMapping("/get/name")
    public AdminUser get(){
        //获取当前用户的身份信息
        AdminUser user = (AdminUser) SecurityUtils.getSubject().getPrincipal();
        return user;
    }
}
