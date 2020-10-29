package com.yuanheng.openAdminPlatform.mapper;

import com.yuanheng.openAdminPlatform.pojo.AdminUser;
import com.yuanheng.openAdminPlatform.pojo.AdminUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.openAdminPlatform.mapper
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-29 15:52
 */
public interface AdminUserMapper {

    long countByExample(AdminUserExample example);

    int deleteByExample(AdminUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminUser record);

    int insertSelective(AdminUser record);

    List<AdminUser> selectByExample(AdminUserExample example);

    AdminUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminUser record, @Param("example") AdminUserExample example);

    int updateByExample(@Param("record") AdminUser record, @Param("example") AdminUserExample example);

    int updateByPrimaryKeySelective(AdminUser record);

    int updateByPrimaryKey(AdminUser record);
}
