package com.employee_thymeleaf.mapper;

import com.employee_thymeleaf.dto.EmployeeDTO;
import com.employee_thymeleaf.entity.EmployeeEntity;

public class EmployeeMapper {

    public static EmployeeDTO mapToEmployeeDTO(EmployeeEntity employeeEntity) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employeeEntity.getId());
        employeeDTO.setName(employeeEntity.getName());
        employeeDTO.setDesignation(employeeEntity.getDesignation());
        employeeDTO.setSalary(employeeEntity.getSalary());
        employeeDTO.setEmail(employeeEntity.getEmail());
        employeeDTO.setAge(employeeEntity.getAge());
        return employeeDTO;
    }

    public static EmployeeEntity mapToEmployeeEntity(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setId(employeeDTO.getId());
        employeeEntity.setName(employeeDTO.getName());
        employeeEntity.setDesignation(employeeDTO.getDesignation());
        employeeEntity.setSalary(employeeDTO.getSalary());
        employeeEntity.setEmail(employeeDTO.getEmail());
        employeeEntity.setAge(employeeDTO.getAge());
        return employeeEntity;
    }
}

