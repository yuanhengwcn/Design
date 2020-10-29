package com.yuanheng.openAdminPlatform.controller;

import com.yuanheng.openAdminPlatform.bean.TreeNode;
import com.yuanheng.openAdminPlatform.pojo.AdminUser;
import com.yuanheng.openAdminPlatform.pojo.Menu;
import com.yuanheng.openAdminPlatform.service.AdminUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.openAdminPlatform.controller
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-29 15:48
 */

@RestController
public class MenuController {

    @Autowired
    private AdminUserService adminUserService;

    @RequiresPermissions("sys:menu:delete")
    @RequestMapping("/menu/delete")
    public String delete(){
        return "delete OK";
    }

    @RequiresPermissions("sys:menu:add")
    @RequestMapping("/menu/add")
    public String add(){
        return "add OK";
    }

    @RequiresPermissions("sys:menu:update")
    @RequestMapping("/menu/update")
    public String update(){
        return "update OK";
    }

    @RequestMapping("/menus")
    @ResponseBody
    public List<TreeNode> getMenus(){

        //查找所有的Menu
        List<Menu> allMenus = adminUserService.getAllMenus();

        //拿到传过来的身份信息
        AdminUser user = (AdminUser) SecurityUtils.getSubject().getPrincipal();

        //拿到身份信息中的id,根据这个id进行查询这个user对应的menu
        List<Menu> menusByUserId = adminUserService.findMenusByUserId(user.getId());


        List<TreeNode> treeNodes = allMenus.stream().map(menu->{
            TreeNode node = new TreeNode();
            node.setId(menu.getId());
            node.setpId(menu.getParentId());
            node.setName(menu.getName());
            node.setOpen(true);


            for (Menu un : menusByUserId){
                if (menu.getPerms().equalsIgnoreCase(un.getPerms())){
                    node.setChecked(true);
                    break;
                }else{
                    node.setChecked(false);
                }
            }


            return node;
        }).collect(Collectors.toList());

        return treeNodes;
    }
}
