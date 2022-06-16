package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeServiceImpl;
import com.csi.vo.RestTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/")
    public Employee saveData(@RequestBody Employee employee){
        return employeeServiceImpl.saveData(employee);
    }

    @GetMapping("/{employeeId}")
    public RestTemplateVO getDataById(@PathVariable int employeeId){

        return employeeServiceImpl.getDataById(employeeId);

    }
}
