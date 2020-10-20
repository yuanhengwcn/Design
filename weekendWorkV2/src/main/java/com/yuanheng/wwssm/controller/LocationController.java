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
 * @CreateTime: 2020-10-18 18:03
 */

@Controller
public class LocationController {

    @Autowired
    LocationService locationService;

    @RequestMapping("/search")
    public String search(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum, @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize, Model model, LocationVO locationVO){

        PageInfo<Location> pageInfo = locationService.search(pageNum, pageSize, locationVO);

        model.addAttribute("pageInfo", pageInfo);

        return "index";
    }


}
