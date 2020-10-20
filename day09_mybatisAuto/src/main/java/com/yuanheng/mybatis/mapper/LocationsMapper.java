package com.yuanheng.mybatis.mapper;

import com.yuanheng.mybatis.po.Locations;
import com.yuanheng.mybatis.po.LocationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocationsMapper {
    long countByExample(LocationsExample example);

    int deleteByExample(LocationsExample example);

    int deleteByPrimaryKey(String locationId);

    int insert(Locations record);

    int insertSelective(Locations record);

    List<Locations> selectByExample(LocationsExample example);

    Locations selectByPrimaryKey(String locationId);

    int updateByExampleSelective(@Param("record") Locations record, @Param("example") LocationsExample example);

    int updateByExample(@Param("record") Locations record, @Param("example") LocationsExample example);

    int updateByPrimaryKeySelective(Locations record);

    int updateByPrimaryKey(Locations record);
}