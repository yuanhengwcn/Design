package com.yuanheng.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.springmvc.controller
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-15 14:46
 */
@Controller
public class ErrorController {

    //当服务器启动后，直接访问/error接口，携带着"操作失败，稍后再试！"跳转到error.jsp页面
    @RequestMapping("/error")
    public String error(Model model){
        model.addAttribute("error", "操作失败，稍后再试！");
        return "error";
    }

}
