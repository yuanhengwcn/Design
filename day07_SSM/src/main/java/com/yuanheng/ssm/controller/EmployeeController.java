package com.yuanheng.ssm.controller;

import com.yuanheng.ssm.po.Employee;
import com.yuanheng.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.ssm.controller
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-16 08:41
 */

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Employee> list = employeeService.list();
        model.addAttribute("list", list);
        return "list";
    }
}
