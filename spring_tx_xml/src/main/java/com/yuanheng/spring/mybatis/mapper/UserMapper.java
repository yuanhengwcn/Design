package com.yuanheng.spring.mybatis.mapper;

import com.yuanheng.spring.mybatis.pojo.User;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.spring.mybatis.mapper
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-13 11:42
 */
public interface UserMapper {
    int insert(User user);
}
