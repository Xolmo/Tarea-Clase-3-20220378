package com.example.clase4gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int id;
    @Column(nullable = false)
    private String last_Name;
    @Column(nullable = false)
    private String first_Name;
    private String email;
    private String phone_number;
    private Date hire_date;
    private float salary;
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Departments department;

}
