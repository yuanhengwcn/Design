package com.yuanheng.wwssm.mapper;

import com.yuanheng.wwssm.po.Location;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.wwssm.mapper
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-18 13:34
 */
public interface LocationMapper {
    List<Location> list();

    List<Location> search(Location location);

    int delete(@Param("countryName") String countryName);
}
