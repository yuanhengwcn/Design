package com.yuanheng.mybatis.relation.mapper;

import com.yuanheng.mybatis.relation.pojo.Passports;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.mybatis.relation.mapper
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-20 11:27
 */
public interface PassportsMapper {

    Passports findById(Integer id);
}
