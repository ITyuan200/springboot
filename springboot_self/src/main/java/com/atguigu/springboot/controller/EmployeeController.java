package com.atguigu.springboot.controller;

import com.atguigu.springboot.entities.Employee;
import com.atguigu.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;

/*
* 最终实现的功能，在浏览器地址栏发送一个请求。得到json格式字符串
*
* */
//@RestController
//@RestController is a stereotype annotation that combines @ResponseBody and @Controller.
@Controller
//@ResponseBody
public class EmployeeController {

    /*
    *@RequestMapping注解，用来映射请求地址
    *   value属性：设置请求地址，value属性名可以省略不写
    *
    * @RequestParam注解：用来映射请求参数
    * @ResponseBody注解：将处理器方法的返回值直接响应给浏览器
    *
    * */

    @Autowired
    EmployeeService employeeService;


    //去首页
    @RequestMapping("/index")
    public String index(){
        System.out.println("进入index");
        return "index";
    }
    @ResponseBody
    @RequestMapping(value = "/getEmp")
    public Employee getEmployee(@RequestParam("id") Integer id){
        System.out.println("得到id为"+id);

        Employee employee = employeeService.getEmployee(id);
        return  employee;
    }


    /*
    *@PathVariable注解，用来映射rest风格的URL中的请求参数
    *  value属性：指定占位符的值
    *
    * */
    //rest风格
    @ResponseBody
    @RequestMapping(value = "/emp/{id}",method = RequestMethod.GET)
    public Employee getEmployee2(@PathVariable("id") Integer id){
        System.out.println("rest风格得到id为"+id);

        Employee employee = employeeService.getEmployee(id);
        return  employee;
    }
}
