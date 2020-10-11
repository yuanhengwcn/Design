package com.yuanheng.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) context.getBean("student");

        System.out.println(student.toString());

        System.out.println("-------------上面是最常用的set方法注入------------------");


        Toolsman toolsman = (Toolsman) context.getBean("toolsman");

        System.out.println(toolsman.toString());

        System.out.println("-------------上面是最常用的构造方法注入------------------");

        Sber sber = (Sber) context.getBean("sber");

        System.out.println(sber.toString());

        System.out.println("-------------上面是自动注入------------------");

        StudentComplex studentComplex = (StudentComplex) context.getBean("studentComplex");

        System.out.println(studentComplex.toString());

        System.out.println("-------------上面是添加了list的set注入------------------");

        StudentAddress studentAddress = (StudentAddress) context.getBean("studentAddress");

        System.out.println(studentAddress.toString());

        System.out.println("-------------上面是在bean中引入了别的类的set注入------------------");

    }

}
