package com.yuanheng;

import com.yuanheng.mapper.UsersMapper;
import com.yuanheng.pojo.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");

        UsersMapper usersMapper = context.getBean(UsersMapper.class);

        List<Users> list = usersMapper.list();

        System.out.println(list);
    }
}
