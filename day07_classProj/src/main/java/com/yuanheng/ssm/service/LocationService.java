package com.yuanheng.ssm.service;

import com.github.pagehelper.PageInfo;
import com.yuanheng.ssm.po.MyLocation;
import com.yuanheng.ssm.vo.LocationVO;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.ssm.service
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-17 15:15
 */
public interface LocationService {
    List<MyLocation> list();

    PageInfo page(Integer page, Integer pageSize);

    PageInfo page(Integer page, Integer pageSize, LocationVO locationVO);

    boolean delete(Integer id);

    MyLocation get(Integer id);
}
