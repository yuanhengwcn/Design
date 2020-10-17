package com.yuanheng.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.springmvc.controller
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-15 14:47
 */
@Controller
public class ProductController {

    @RequestMapping("/save")
    public String save(Integer id) throws IOException{
        if (id % 2 == 0){
            throw new IOException();
    }

        return "product";
    }

}
