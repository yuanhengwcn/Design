package com.yuanheng.wwssm.controller;

import com.github.pagehelper.PageInfo;
import com.yuanheng.wwssm.po.Location;
import com.yuanheng.wwssm.service.LocationService;
import com.yuanheng.wwssm.vo.LocationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.wwssm.controller
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-18 13:18
 */

@Controller
public class LocationController {

    @Autowired
    private LocationService locationService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Location> location = locationService.list();
        System.out.println(location);
        model.addAttribute("location", location);
        return "list";
    }

    @RequestMapping("/search")
    public String search(LocationVO locationVO, Model model, @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, @RequestParam(value = "PageSize", defaultValue = "10") Integer pageSize){

        PageInfo<Location> pageInfo = locationService.search(locationVO, pageNum, pageSize);
        String url = "countryName=" + locationVO.getCountryName();
        model.addAttribute("pageInfo", pageInfo);
        System.out.println(pageInfo);

        model.addAttribute("locationVO", locationVO);
        model.addAttribute("url",url);
        return "location/list";
    }



    //做到删除这一步，发现Location类中没有添加locationId，导致无法删除
    //TODO
    @RequestMapping("/delete")
    public String delete(@RequestParam("countryName") String countryName){
        locationService.delete(countryName);
        return "redirect:/search";
    }


    @RequestMapping("/edit")
    public String edit(LocationVO locationVO, Model model){
        return "location/edit";
    }

}
