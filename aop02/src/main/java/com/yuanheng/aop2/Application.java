package com.yuanheng.aop2;

import com.yuanheng.aop2.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.aop2
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-12 21:57
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        student.study();
    }
}
