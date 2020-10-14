package com.yuanheng.annotation.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.annotation.service
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-13 19:09
 */
@Service
public class UserService {

    //只针对数据库，普通语句还是会执行的
    @Transactional(rollbackFor = Exception.class)

    public void insert(){

        System.out.println("UserService insert方法被执行了");
        System.out.println(1/0);
    }
}
