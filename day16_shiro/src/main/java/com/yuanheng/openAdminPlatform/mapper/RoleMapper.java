package com.yuanheng.openAdminPlatform.mapper;

import com.yuanheng.openAdminPlatform.pojo.Role;
import com.yuanheng.openAdminPlatform.pojo.RoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.openAdminPlatform.mapper
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-29 15:53
 */
public interface RoleMapper {

    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> findUserRoles(Integer userId);

}
