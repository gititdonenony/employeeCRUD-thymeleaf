package com.employee_thymeleaf.service.impl;

import com.employee_thymeleaf.entity.EmployeeEntity;
import com.employee_thymeleaf.repository.EmployeeRepository;
import com.employee_thymeleaf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public List<EmployeeEntity> getEmployees() {
        return employeeRepository.findAll();
    }
}
