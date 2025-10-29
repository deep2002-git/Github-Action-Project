package com.example.APIs_for_Testing.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class DepartmentLombok {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private  String departmentCode;



}
