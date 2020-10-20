package com.yuanheng.ssm.mapper;

import com.yuanheng.ssm.po.MyLocation;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.ssm.mapper
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-17 15:24
 */
public interface LocationMapper {

    List<MyLocation> list();

    List<MyLocation> search(MyLocation myLocation);

    int delete(Integer id);

    MyLocation get(Integer id);
}
