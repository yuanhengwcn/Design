package com.yuanheng.springmvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yuanheng.springmvc.pojo.User;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.springmvc
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-15 17:55
 */
public class TestSynchronized {

    public synchronized void method1(){

    }

    public void method2(){
        Object obj = new Object();
        synchronized (obj){

        }
    }

    public static void main(String[] args) throws JsonProcessingException{
        User user = new User();
        user.setId(1001);
        user.setName("文文兄");
        user.setGender("男");
        user.setHobby("吃饭");
        user.setDesc("你今天吃饱饭了吗，如果没有吃饭我请你，咋们一起去happy.....");

        ObjectMapper obj = new ObjectMapper();
        String json = obj.writeValueAsString(user);
        System.out.println(json);
    }

}
