package com.yuanheng.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.yuanheng.ssm.po.Location;
import com.yuanheng.ssm.po.MyLocation;
import com.yuanheng.ssm.service.LocationService;
import com.yuanheng.ssm.vo.LocationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.ssm.controller
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-17 15:02
 */
@Controller
public class LocationController {

    @Autowired
    private LocationService locationService;

    @RequestMapping("/locationList")
    public String list(Model model){
        List<MyLocation> list = locationService.list();
        model.addAttribute("list",list);
        return "listForLocation";
    }

    @RequestMapping("/locationSearch")
    public String search(@RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "size", defaultValue = "10") Integer pageSize, Model model, LocationVO locationVO){

        PageInfo pageInfo = locationService.page(page, pageSize, locationVO);
        String url = "countryName=" + locationVO.getCountryName();
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("url", url);
        //这个用来作为搜索框回传的值
        model.addAttribute("locationVO");

        return "location/list";
    }

    @RequestMapping("/location/delete")
    public String delete(Integer id){
        locationService.delete(id);
        return "redirect:/locationSearch";
    }

    @RequestMapping("/location/edit")
    public String edit(Integer id, Model model, LocationVO locationVO){
        MyLocation myLocation = locationService.get(id);
        model.addAttribute("myLocation", myLocation);
        model.addAttribute("location", locationVO);
        return "location/edit";
    }
}
