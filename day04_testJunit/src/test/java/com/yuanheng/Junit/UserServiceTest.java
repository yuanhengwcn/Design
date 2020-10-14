package com.yuanheng.Junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.Junit
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-13 22:02
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext-service.xml")
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void insert(){
        userService.insert();
    }

}
