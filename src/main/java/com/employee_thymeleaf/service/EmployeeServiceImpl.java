package com.employee_thymeleaf.service;

import com.employee_thymeleaf.dto.EmployeeDTO;
import com.employee_thymeleaf.entity.EmployeeEntity;
import com.employee_thymeleaf.mapper.EmployeeMapper;
import com.employee_thymeleaf.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = EmployeeMapper.mapToEmployeeEntity(employeeDTO);
        EmployeeEntity savedEmployeeEntity = employeeRepository.save(employeeEntity);
        EmployeeDTO savedEmployeeDTO = EmployeeMapper.mapToEmployeeDTO(savedEmployeeEntity);
        return savedEmployeeDTO;
    }
}
