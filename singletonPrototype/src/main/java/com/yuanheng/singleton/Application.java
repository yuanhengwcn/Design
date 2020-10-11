package com.yuanheng.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //成功出现student类无参构造方法“加载成功字样”。

        Student student = (Student) context.getBean("student");
        Student student1 = (Student) context.getBean("student");

        if (student1 == student){
            System.out.println("两个对象是同一个");
        }
    }
}
