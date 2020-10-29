package com.yuanheng.openAdminPlatform.realm;

import com.yuanheng.openAdminPlatform.pojo.AdminUser;
import com.yuanheng.openAdminPlatform.pojo.Menu;
import com.yuanheng.openAdminPlatform.pojo.Role;
import com.yuanheng.openAdminPlatform.service.AdminUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.openAdminPlatform.realm
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-29 15:33
 */
public class MyRealm extends AuthorizingRealm {

    private AdminUserService adminUserService;


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        //1.根据身份信息获取角色
        AdminUser user = (AdminUser) principals.getPrimaryPrincipal();
        List<Role> userRoles = adminUserService.findUserRoles(user.getId());

        List<String> roles = userRoles.stream().map(r -> r.getRemark()).collect(Collectors.toList());

        //2.根据身份信息获取权限信息
        List<Menu> userMenus = adminUserService.findMenusByUserId(user.getId());
        List<String> menus = userMenus.stream().filter(s-> !StringUtils.isEmpty(s.getPerms())).map(m -> m.getPerms()).collect(Collectors.toList());
        System.out.println(menus);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRoles(roles);
        info.addStringPermissions(menus);

        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //1.获取令牌中的用户名
        String username = (String) token.getPrincipal();//

        //2.根据用户名查询数据库
        AdminUser user = adminUserService.findUserByName(username);

        //3.返回info对象
        SimpleAuthenticationInfo info = null;
        if (user != null) {
            //第一个参数可以是user对象，也可以是用户名
            //第二个参数是从数据库中获取的密码
            //这里获取的密码与token中的密码进行比对
            info = new SimpleAuthenticationInfo(user, user.getPassword(), ByteSource.Util.bytes("admin123"), "MyRealm");
        }

        return info;
    }

    public void setAdminUserService(AdminUserService adminUserService) {
        this.adminUserService = adminUserService;
    }

    //这个主方法，其实跟逻辑无关，只是单纯拿到加盐后的hash值
    public static void main(String[] args) {
        Md5Hash m = new Md5Hash("admin", "admin123", 120);
        System.out.println(m);
    }

}
