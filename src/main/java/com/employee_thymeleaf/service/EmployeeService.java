package com.employee_thymeleaf.service;

import com.employee_thymeleaf.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    EmployeeEntity createEmployee(EmployeeEntity entity);

    List<EmployeeEntity> getEmployees();
}
