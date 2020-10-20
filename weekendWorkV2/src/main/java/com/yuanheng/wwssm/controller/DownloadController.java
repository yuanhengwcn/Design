package com.yuanheng.wwssm.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.wwssm.controller
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-19 20:07
 */

@Controller
@RequestMapping("/download")
public class DownloadController {

    /*用这个name接收文件名*/
    @RequestMapping("/test1")
    public void hello1(String name, HttpSession session, HttpServletResponse response) throws IOException {

        System.out.println("name" + name);

        /*要下载的文件的绝对路径*/
        String path  = session.getServletContext().getRealPath("/upload_file");

        /*下载文件的url，即：绝对路径 + 文件名*/
        String real_path = path + "\\" + name;

        //这个header可以标记该文件是以什么形式传输的，是附件还是浏览器可以直接打开的形式
        response.setHeader("content-disposition", "attachment;filename=" + name);

        //下载本质上就是赋值，用了IOUtils类的copy()方法
        IOUtils.copy(new FileInputStream(real_path), response.getOutputStream());

    }
}
