package com.yuanheng.mapper;

import com.yuanheng.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.mapper
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-12 23:34
 */
public interface UsersMapper {
    List<Users> list();
    Users findById(@Param("id") Integer id);
}
