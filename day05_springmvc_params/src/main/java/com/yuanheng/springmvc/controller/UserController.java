package com.yuanheng.springmvc.controller;

import com.yuanheng.springmvc.mapper.UserMapper;
import com.yuanheng.springmvc.vo.RegUser;
import com.yuanheng.springmvc.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.springmvc.controller
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-14 15:03
 */

@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/list")
    public String list(Integer id, String name, Integer age, @DateTimeFormat(pattern = "yyyy-MM-dd") Date birth){
        System.out.println("id:" + id + ",name:" + name + ",age:" + age);
        System.out.println(birth);

        return "users";
    }

    @RequestMapping("/list2")
    public String list2(User user){
        System.out.println(user);
        return "users";
    }

    @RequestMapping("/list3/{id}/{name}")
    public String list2(@PathVariable("id") Integer id, @PathVariable String name){
        System.out.println(id + " " + name);
        return "users";
    }

    @RequestMapping("/reg")
    public String reg(){
        return "reg";
    }

    @RequestMapping("/save")
    public String save(RegUser regUser, HttpSession session){
        if(userMapper.checkSameName(regUser)){
            userMapper.add(regUser);
            System.out.println(userMapper.list());
            return "redirect:/login";
        }else {
            session.setAttribute("username", regUser.getUsername());
            session.setAttribute("sameNameInfo","该用户名已被注册");
            return "redirect:/reg";
        }

    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/check")
    public String checkLogin(String username, String password, HttpServletRequest request, HttpSession session){

        //数据回显
        request.setAttribute("username", username);

        RegUser retUser = userMapper.findByName(username);


        if(retUser == null){
            request.setAttribute("error", "用户名不存在");
            return "login";
            }else{
                if(retUser.getPassword().equalsIgnoreCase(password)){
                    session.setAttribute("userInfo", retUser);
                    //mvc重定向与请求转发一般都是先跳转到一个后端控制器，再由这个控制器转发到新的页面上
                    return "redirect:/users";
                }else {
                    request.setAttribute("error", "密码错误");
                    return "login";
            }
        }
    }

    @RequestMapping("/users")
    public String users(){
        return "users";
    }
}
