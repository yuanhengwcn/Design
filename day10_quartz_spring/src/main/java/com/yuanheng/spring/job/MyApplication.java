package com.yuanheng.spring.job;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.spring.job
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-21 15:48
 */
public class MyApplication {
    public static void main(String[] args) {
        //在创建Spring容器的时候就会执行
        new ClassPathXmlApplicationContext("applicationContext-job.xml");
    }


}
