package com.csi.service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import com.csi.vo.RestTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeDaoImpl employeeDaoImpl;


    public Employee saveData(Employee employee) {
        return employeeDaoImpl.saveData(employee);
    }

    public RestTemplateVO getDataById(int employeeId) {
        return employeeDaoImpl.getDataById(employeeId);
    }
}
