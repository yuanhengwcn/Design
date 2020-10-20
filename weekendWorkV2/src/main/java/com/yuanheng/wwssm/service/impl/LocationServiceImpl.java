package com.yuanheng.wwssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuanheng.wwssm.mapper.LocationMapper;
import com.yuanheng.wwssm.po.Location;
import com.yuanheng.wwssm.service.LocationService;
import com.yuanheng.wwssm.vo.LocationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.wwssm.service.impl
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-18 18:07
 */

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationMapper locationMapper;

    @Override
    public PageInfo<Location> search(Integer pageNum, Integer pageSize, LocationVO locationVO) {

        PageHelper.startPage(pageNum, pageSize);



        Location location = new Location();

        location.setCountryName(locationVO.getCountryName());


        //这一条语句出错
        List<Location> list = locationMapper.Page(location);

        PageInfo<Location> pageInfo = new PageInfo<>(list);

        System.out.println(pageInfo);


        return pageInfo;
    }
}
