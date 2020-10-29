package com.yuanheng.openAdminPlatform.service;

import com.yuanheng.openAdminPlatform.mapper.AdminUserMapper;
import com.yuanheng.openAdminPlatform.mapper.MenuMapper;
import com.yuanheng.openAdminPlatform.mapper.RoleMapper;
import com.yuanheng.openAdminPlatform.pojo.AdminUser;
import com.yuanheng.openAdminPlatform.pojo.AdminUserExample;
import com.yuanheng.openAdminPlatform.pojo.Menu;
import com.yuanheng.openAdminPlatform.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.openAdminPlatform.service
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-29 15:50
 */

@Service
public class AdminUserService {
    @Autowired
    private AdminUserMapper adminUserMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private MenuMapper menuMapper;

    public AdminUser findUserByName(String username) {

        AdminUserExample example = new AdminUserExample();
        AdminUserExample.Criteria criteria = example.createCriteria();
        criteria.andEmailEqualTo(username);

        List<AdminUser> adminUsers = adminUserMapper.selectByExample(example);
        return adminUsers.size() > 0 ? adminUsers.get(0) : null;
    }


    public List<Role> findUserRoles(Integer id) {
        return roleMapper.findUserRoles(id);
    }


    public List<Menu> findMenusByUserId(Integer id){
        return menuMapper.findMenusByUserId(id);
    }

    //查询所有的菜单
    public List<Menu> getAllMenus() {
        return menuMapper.selectByExample(null);
    }
}
