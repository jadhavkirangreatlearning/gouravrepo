package com.csi.dao;


import com.csi.model.Department;
import com.csi.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DepartmentDaoImpl {

    @Autowired
    DepartmentRepo departmentRepoImpl;


    public Department saveData(Department department) {
        return departmentRepoImpl.save(department);
    }

    public Optional<Department> getDataById(int departmentId) {
        return departmentRepoImpl.findById(departmentId);
    }
}
