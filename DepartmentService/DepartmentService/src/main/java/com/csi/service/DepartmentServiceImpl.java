package com.csi.service;


import com.csi.dao.DepartmentDaoImpl;
import com.csi.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentServiceImpl {

    @Autowired
    DepartmentDaoImpl departmentDaoImpl;


    public Department saveData(Department department) {
        return departmentDaoImpl.saveData(department);
    }

    public Optional<Department> getDataById(int departmentId) {
        return departmentDaoImpl.getDataById(departmentId);
    }
}
