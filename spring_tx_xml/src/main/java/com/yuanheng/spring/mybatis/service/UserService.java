package com.yuanheng.spring.mybatis.service;

import com.yuanheng.spring.mybatis.mapper.UserMapper;

import com.yuanheng.spring.mybatis.pojo.User;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.spring.mybatis.service
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-13 11:34
 */
public class UserService {

    private UserMapper userMapper;

    public void setUserMappper(UserMapper userMappper) {
        this.userMapper = userMappper;
    }

    public User insert(User user) {
        int result = userMapper.insert(user);

        return result > 0 ? user : null;
    }


}
