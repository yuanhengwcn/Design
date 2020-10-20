package com.yuanheng.mybatis.mapper;

import com.yuanheng.mybatis.po.Jobs;
import com.yuanheng.mybatis.po.JobsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobsMapper {
    long countByExample(JobsExample example);

    int deleteByExample(JobsExample example);

    int deleteByPrimaryKey(String jobId);

    int insert(Jobs record);

    int insertSelective(Jobs record);

    List<Jobs> selectByExample(JobsExample example);

    Jobs selectByPrimaryKey(String jobId);

    int updateByExampleSelective(@Param("record") Jobs record, @Param("example") JobsExample example);

    int updateByExample(@Param("record") Jobs record, @Param("example") JobsExample example);

    int updateByPrimaryKeySelective(Jobs record);

    int updateByPrimaryKey(Jobs record);
}