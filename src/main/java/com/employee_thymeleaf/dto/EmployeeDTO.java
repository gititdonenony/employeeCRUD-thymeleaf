package com.employee_thymeleaf.dto;

import lombok.Data;

@Data
public class EmployeeDTO {
    private long id;
    private String name;
    private String designation;
    private int salary;
    private String email;
    private int age;


}
