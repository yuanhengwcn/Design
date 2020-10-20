package com.yuanheng.wwssm.mapper;

import com.yuanheng.wwssm.po.Location;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.wwssm.mapper
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-18 18:08
 */
public interface LocationMapper {
    List<Location> Page(Location location);
}
