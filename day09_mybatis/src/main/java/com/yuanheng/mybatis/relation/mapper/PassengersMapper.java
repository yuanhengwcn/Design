package com.yuanheng.mybatis.relation.mapper;

import com.yuanheng.mybatis.relation.pojo.Passengers;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.mybatis.relation.mapper
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-20 11:20
 */
public interface PassengersMapper {

    Passengers findById(Integer id);
}
