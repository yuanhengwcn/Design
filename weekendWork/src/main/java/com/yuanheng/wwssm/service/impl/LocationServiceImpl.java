package com.yuanheng.wwssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuanheng.wwssm.exception.MyException;
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
 * @CreateTime: 2020-10-18 13:31
 */

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationMapper locationMapper;

    @Override
    public List<Location> list() {
        return locationMapper.list();
    }

    @Override
    public PageInfo<Location> search(LocationVO locationVO, Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum,pageSize);

        Location location = new Location();
        location.setCountryName(locationVO.getCountryName());

        List<Location> locations = locationMapper.search(location);

        PageInfo<Location> pageInfo = new PageInfo<>(locations);

        return pageInfo;
    }

    @Override
    public boolean delete(String countryName) {
        int row = locationMapper.delete(countryName);
        if (row > 0){
            return true;
        }else {
            throw new MyException("该Location已被删除");
        }
    }


}
