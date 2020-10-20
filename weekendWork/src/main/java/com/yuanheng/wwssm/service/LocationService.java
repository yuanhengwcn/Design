package com.yuanheng.wwssm.service;

import com.github.pagehelper.PageInfo;
import com.yuanheng.wwssm.po.Location;
import com.yuanheng.wwssm.vo.LocationVO;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.wwssm.service
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-18 13:31
 */
public interface LocationService {
    List<Location> list();

    PageInfo<Location> search(LocationVO locationVO, Integer pageNum, Integer pageSize);

    boolean delete(String countryName);
}
