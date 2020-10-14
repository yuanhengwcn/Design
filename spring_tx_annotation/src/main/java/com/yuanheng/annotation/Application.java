package com.yuanheng.annotation;

import com.yuanheng.annotation.bean.Student;
import com.yuanheng.annotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.annotation
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-13 19:57
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu = context.getBean(Student.class);
        System.out.println(stu);

        UserService service = context.getBean(UserService.class);
        service.insert();
    }
}
