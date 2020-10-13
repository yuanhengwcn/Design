package com.yuanheng.spring.mybatis;

import com.yuanheng.spring.mybatis.pojo.User;
import com.yuanheng.spring.mybatis.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.spring.mybatis
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-13 11:30
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");

        UserService userService = (UserService) context.getBean("userService");

        User u = new User();


        u.setUsername("cccc");
        u.setAddress("bbbb");
        u.setGender("男");
        u.setHobby("女");
        u.setPassword("123456");
        u.setPic("3.jpg");

        User ret = userService.insert(u);

        System.out.println(ret);


    }
}
