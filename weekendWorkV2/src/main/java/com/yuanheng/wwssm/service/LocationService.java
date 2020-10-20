package com.yuanheng.wwssm.service;

import com.github.pagehelper.PageInfo;
import com.yuanheng.wwssm.po.Location;
import com.yuanheng.wwssm.vo.LocationVO;



/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.wwssm.service
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-18 18:06
 */
public interface LocationService {
    PageInfo<Location> search(Integer pageNum, Integer pageSize, LocationVO locationVO);



}
