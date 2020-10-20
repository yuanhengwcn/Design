package com.yuanheng.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.yuanheng.ssm.po.Department;
import com.yuanheng.ssm.po.Employee;
import com.yuanheng.ssm.po.Job;
import com.yuanheng.ssm.po.MyEmployee;
import com.yuanheng.ssm.service.DepartmentService;
import com.yuanheng.ssm.service.EmployeeService;
import com.yuanheng.ssm.service.JobService;
import com.yuanheng.ssm.vo.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.ssm.controller
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-16 19:38
 */

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private JobService jobService;

    @Autowired
    private DepartmentService departmentService;

    //展示表中所有的信息
    @RequestMapping("/list")
    public String list(Model model){
        List<MyEmployee> list = employeeService.list();
        model.addAttribute("list",list);
        return "list";
    }

    //在查询接口下面调用的page()方法
    @RequestMapping("/search")
    public String search(@RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "size", defaultValue = "10") Integer pageSize, Model model, EmployeeVO employeeVO){

        //查询所有的工作，用来展示
        List<Job> jobs = jobService.list();

        //查询所有的管理
        List<Department> departments = departmentService.list();

        // 查询所有的员工信息
        //一开始进/search接口，没有传参数的话，就没有employeeVO，就相当于只有两个参数，所以需要定义page()的两个参数的方法
        PageInfo<MyEmployee> pageInfo = employeeService.page(employeeVO, page, pageSize);

        //生成url，底部导航处需要使用
        String url = "keyWord=" + employeeVO.getKeyWord() + "&jobId=" + employeeVO.getJobId() + "&departmentId=" + employeeVO.getDepartmentId();

        //将结果给到model
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("jobs", jobs);
        model.addAttribute("departments", departments);
        model.addAttribute("employeeVO", employeeVO);
        model.addAttribute("url", url);
        return "employee/list";
    }

    @RequestMapping("/employee/delete")
    public String delete(Integer id){
        employeeService.delete(id);
        return "redirect:/search";
    }

    @RequestMapping("/employee/edit")
    //接收从前端跳来的信息，根据信息进行查询，查询后封装到model中，再传递到edit页面
    public String edit(Integer id, Model model){
        //查询岗位
        List<Job> jobs = jobService.list();
        //查询部门
        List<Department> departments = departmentService.list();
        //根据当前id查询员工信息
        Employee employee = employeeService.get(id);
        model.addAttribute("employee", employee);
        model.addAttribute("jobs", jobs);
        model.addAttribute("departments", departments);
        return "employee/edit";
    }

    @RequestMapping("/employee/update")
    @ResponseBody
    public boolean update(@RequestBody Employee employee){
        System.out.println(employee);
        boolean result = employeeService.update(employee);
        return result;
    }

}
