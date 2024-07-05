package com.employee_thymeleaf.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "EMPLOYEE_TABLE")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESIGNATION")
    private String designation;
    @Column(name = "SALARY")
    private int salary;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "AGE")
    private int age;

}
