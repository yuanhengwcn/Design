package com.yuanheng.mybatis.mapper;

import com.yuanheng.mybatis.po.Passports;
import com.yuanheng.mybatis.po.PassportsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PassportsMapper {
    long countByExample(PassportsExample example);

    int deleteByExample(PassportsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Passports record);

    int insertSelective(Passports record);

    List<Passports> selectByExample(PassportsExample example);

    Passports selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Passports record, @Param("example") PassportsExample example);

    int updateByExample(@Param("record") Passports record, @Param("example") PassportsExample example);

    int updateByPrimaryKeySelective(Passports record);

    int updateByPrimaryKey(Passports record);
}