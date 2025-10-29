package com.example.APIs_for_Testing.service;

import com.example.APIs_for_Testing.entity.DepartmentManual;

import java.util.List;

public interface DepartmentService {

    DepartmentManual saveDepartment(DepartmentManual departmentManual);
    List<DepartmentManual> fetchDepartmentList();
    DepartmentManual updateDepartment(DepartmentManual departmentManual , Long departmentId);
    DepartmentManual findByDepartmentId(Long id);

    void deleteDepartmentById(Long id);

}
