package com.csi.controller;

import com.csi.model.Department;

import com.csi.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    DepartmentServiceImpl departmentServiceImpl;

    @PostMapping("/")
    public Department saveData(@RequestBody Department department){
        return departmentServiceImpl.saveData(department);
    }

    @GetMapping("/{departmentId}")
    public Optional<Department> getDataById(@PathVariable int departmentId){

        return departmentServiceImpl.getDataById(departmentId);

    }

}
