package com.yuanheng.springmvc.mapper;

import com.yuanheng.springmvc.vo.RegUser;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.springmvc.mapper
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-14 15:15
 */
@Repository
public class UserMapper {
    private static List<RegUser> list = new ArrayList<RegUser>();

    public boolean add(RegUser user){
        list.add(user);
        return true;
    }

    public List<RegUser> list(){
        return list;
    }


    public RegUser findByName(String username){
        RegUser retUser = null;
        for(RegUser u :list){
            if(u.getUsername().equalsIgnoreCase(username)){
                retUser = u;
                break;
            }
        }
        return retUser;
    }

    public boolean checkSameName(RegUser regUser) {
        for (RegUser u : list){
            if (u.getUsername().equalsIgnoreCase(regUser.getUsername())){
                return false;
            }
        }
        return true;
    }
}
