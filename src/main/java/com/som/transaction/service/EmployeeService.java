package com.som.transaction.service;

import com.som.transaction.entity.Department;
import com.som.transaction.entity.Employee;
import com.som.transaction.model.EmployeeRequest;
import com.som.transaction.repository.DepartmentRepository;
import com.som.transaction.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired private EmployeeRepository employeeRepository;
    @Autowired private DepartmentRepository departmentRepository;
    @Transactional
    public String saveEmployee(EmployeeRequest employeeRequest) {
        Department department = new Department();
        department.setDepartmentName(employeeRequest.getDepartmentName());
        department.setDepartmentCode(employeeRequest.getDepartmentName());

        Long departmentId = departmentRepository.save(department).getDepartmentId();

        Employee employee = new Employee();
        employee.setName(employeeRequest.getName());
        employee.setEmail(employeeRequest.getEmail());
        employee.setDepartmentId(departmentId);

        employeeRepository.save(employee);

        return "Employee is saved with Employee Id: "+employee.getEmployeeId();
    }
}
