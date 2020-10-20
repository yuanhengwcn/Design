package com.yuanheng.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuanheng.ssm.exception.MyException;
import com.yuanheng.ssm.mapper.LocationMapper;
import com.yuanheng.ssm.po.Location;
import com.yuanheng.ssm.po.MyLocation;
import com.yuanheng.ssm.service.LocationService;
import com.yuanheng.ssm.vo.LocationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.ssm.service.impl
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-17 15:17
 */
@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationMapper locationMapper;

    @Override
    public List<MyLocation> list() {
        return locationMapper.list();
    }

    @Override
    public PageInfo page(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        //将查询到的所有信息，封装成一个list
        List<MyLocation> list = locationMapper.list();
        //将list放进PageInfo中
        PageInfo<MyLocation> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo page(Integer pageNum, Integer pageSize, LocationVO locationVO) {
        PageHelper.startPage(pageNum, pageSize);
        MyLocation myLocation = new MyLocation();

        myLocation.setCountryName(locationVO.getCountryName());

        List<MyLocation> list = locationMapper.search(myLocation);

        PageInfo<MyLocation> pageInfo = new PageInfo<>(list);

        return pageInfo;
    }

    @Override
    public boolean delete(Integer id) {
        int rows = locationMapper.delete(id);
        if(rows > 0){
            return true;
        }else{
            throw new MyException("删除地址失败");
        }
    }

    @Override
    public MyLocation get(Integer id) {
        MyLocation myLocation = locationMapper.get(id);
        if(myLocation == null){
            throw new MyException("改地址可能已被删除");
        }
        return myLocation;
    }
}
