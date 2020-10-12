package com.yuanheng.mapper;

import com.yuanheng.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersMapper {

    List<Users> list();

    Users findById(@Param("id") Integer id);
}
