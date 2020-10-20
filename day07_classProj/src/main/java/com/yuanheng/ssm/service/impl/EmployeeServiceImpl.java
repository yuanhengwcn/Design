package com.yuanheng.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuanheng.ssm.exception.MyException;
import com.yuanheng.ssm.mapper.EmployeeMapper;
import com.yuanheng.ssm.po.Employee;
import com.yuanheng.ssm.po.MyEmployee;
import com.yuanheng.ssm.service.EmployeeService;
import com.yuanheng.ssm.vo.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @BelongsProject: Design
 * @BelongsPackage: com.yuanheng.ssm.service.impl
 * @Author: yuanhengwcn@gmail.com
 * @CreateTime: 2020-10-16 19:43
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<MyEmployee> list() {
        return employeeMapper.list();
    }

    @Override
    public PageInfo<MyEmployee> page(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        //将查询到的所有信息，封装成一个list
        List<MyEmployee> list = employeeMapper.list();
        //将list放进PageInfo中
        PageInfo<MyEmployee> pageInfo = new PageInfo<>(list);
        System.out.println(pageInfo);
        return pageInfo;
    }


    @Override
    public PageInfo<MyEmployee> page(EmployeeVO employeeVO, Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum, pageSize);

        Employee employee = new Employee();
        employee.setFirstName(employeeVO.getKeyWord());
        employee.setLastName(employeeVO.getKeyWord());
        //在employeeVO中将departmentId设置成了String类型的了，所以这里需要进行转换
        if(!StringUtils.isEmpty(employeeVO.getDepartmentId())){
            employee.setDepartmentId(Integer.parseInt(employeeVO.getDepartmentId()));
        }
        employee.setJobId(employeeVO.getJobId());

        //将上面生成的employee，传到Mapper中进行查找，得到一个list
        List<MyEmployee> list = employeeMapper.search(employee);

        //将得到的list传到PageInfo中，自动覆盖响应的属性
        PageInfo<MyEmployee> pageInfo = new PageInfo<>(list);

        return pageInfo;

    }

    @Override
    public boolean delete(Integer id) {
        int rows = employeeMapper.delete(id);
        if(rows > 0){
            return true;
        }else{
            throw new MyException("雇员删除失败");
        }
    }

    @Override
    public Employee get(Integer id) {
        Employee employee = employeeMapper.get(id);
        if(employee == null){
            throw new MyException("该员工查询不到");
        }
        return employee;
    }

    @Override
    public boolean update(Employee employee) {
        int row = employeeMapper.update(employee);
        if(row > 0){
            return true;
        }else {
            throw new MyException("雇员信息修改失败");
        }
    }
}
