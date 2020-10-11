package com.yuanheng.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        //注意，配置了切面之后，手动new对象还是无法拿到增强后的数据，必须要使用spring拿对象。
        ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
        Student student = (Student) context.getBean("student");
        student.enjoy();

    }
}
