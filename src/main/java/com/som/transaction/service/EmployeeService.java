package com.som.transaction.service;

import com.som.transaction.model.EmployeeRequest;
import com.som.transaction.repository.DepartmentRepository;
import com.som.transaction.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired private EmployeeRepository employeeRepository;
    @Autowired private DepartmentRepository departmentRepository;
    public String saveEmployee(EmployeeRequest employeeRequest) {

    }
}
