package com.yuanheng.wwssm.controller;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.wwssm.controller
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-19 17:54
 */

@Controller
@RequestMapping("/upload")
public class UpLoadController {
    @RequestMapping("/test1")
    public String hello(String username, MultipartFile source, HttpSession session) throws IOException {


        /*将原生文件名，改造成全局唯一文件名*/
        String filename = source.getOriginalFilename();

        String unique = UUID.randomUUID().toString();

        String ext = FilenameUtils.getExtension(filename);

        String uniqueFileName = unique + "." + ext;

        System.out.println("唯一文件名" + uniqueFileName);



        /*拿到文件类型*/
        String type = source.getContentType();
        System.out.println("filename:" + filename + " type: " + type);

        /*拿到文件要上传到的路径*/
        //获得upload_file的磁盘路径，在webapp目录下创建一个目录"upload_file"，且此目录初始化不要为空，否则编译时被忽略
        String real_path = session.getServletContext().getRealPath("/upload_file");
        System.out.println("real_path:" + real_path);

        /*将source这个文件，转到最终路径，同时命名*/
        // 将上传的文件，存入磁盘路径中
        source.transferTo(new File(real_path + "\\" + uniqueFileName));

        System.out.println("1");
        return "index";
    }
}
