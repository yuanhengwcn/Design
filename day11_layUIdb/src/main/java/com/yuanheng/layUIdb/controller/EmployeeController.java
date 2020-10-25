package com.yuanheng.layUIdb.controller;

import com.github.pagehelper.PageInfo;
import com.yuanheng.layUIdb.po.Employee;
import com.yuanheng.layUIdb.service.EmployeeService;
import com.yuanheng.layUIdb.vo.LayuiTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.layUIdb.controller
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-22 19:36
 */

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/list")
    public LayuiTable<Employee> list(@RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "limit", defaultValue = "10") Integer limit){
        PageInfo<Employee> data = employeeService.page(page, limit);
        LayuiTable<Employee> layuiTable = new LayuiTable<>();
        if(data != null){
            layuiTable.setCode(0);
            layuiTable.setCount((int)data.getTotal());
            layuiTable.setData(data.getList());
        }else {
            layuiTable.setCode(100);
            layuiTable.setMsg("查询数据失败");
        }
        //返回的是JSON字符串，前端进行接收
        return layuiTable;
    }
}
