package com.atguigu.springboot.service.impl;

import com.atguigu.springboot.entities.Employee;
import com.atguigu.springboot.mapper.EmployeeMapper;
import com.atguigu.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;
    @Override
    public Employee getEmployee(Integer id) {
        //Employee employee = new Employee(id,"张三","zhnagsan@lisi.com",8000.0,"研发部");
        //调用EmployeeMapper中根据主键获取员工信息的方法
        Employee employee = employeeMapper.selectByPrimaryKey(id);
        return  employee;
    }
}
