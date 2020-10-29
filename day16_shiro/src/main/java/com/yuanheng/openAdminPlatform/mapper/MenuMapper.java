package com.yuanheng.openAdminPlatform.mapper;

import com.yuanheng.openAdminPlatform.pojo.Menu;
import com.yuanheng.openAdminPlatform.pojo.MenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.openAdminPlatform.mapper
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-29 15:53
 */
public interface MenuMapper {

    long countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> findMenusByUserId(Integer id);

}
