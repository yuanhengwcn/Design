package com.yuanheng.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyClass myClass = (MyClass) context.getBean("myclass");

        myClass.show();

    }

}
