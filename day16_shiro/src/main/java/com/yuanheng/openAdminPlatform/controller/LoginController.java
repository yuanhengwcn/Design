package com.yuanheng.openAdminPlatform.controller;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.openAdminPlatform.controller
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-29 15:47
 */

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(HttpServletRequest request, Model model) {
        String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
        String error = "";
        if (UnknownAccountException.class.getName().equalsIgnoreCase(exceptionClassName)) {
            error = "用户名错误！";
        } else if (IncorrectCredentialsException.class.getName().equalsIgnoreCase(exceptionClassName)) {
            error = "密码错误";
        } else if (exceptionClassName != null) {
            error = "其他错误" + exceptionClassName;
        }
        model.addAttribute("error", error);

        return "login";
    }

    @RequestMapping("/unauthorized")
    public String unauthorized(){
        return "unauthorized";
    }
}
