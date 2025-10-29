package com.example.APIs_for_Testing.service;

import com.example.APIs_for_Testing.entity.DepartmentManual;
import com.example.APIs_for_Testing.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
@Autowired
DepartmentRepository departmentRepository;

    @Override
    public DepartmentManual saveDepartment(DepartmentManual departmentManual)
    {
        return departmentRepository.save(departmentManual);
    }
    @Override
    public List<DepartmentManual> fetchDepartmentList()
    {
        return departmentRepository.findAll();
    }
    @Override
    public DepartmentManual updateDepartment(DepartmentManual  departmentManual , Long departmentId){
        return departmentRepository.save(departmentManual);
    }
    @Override
    public DepartmentManual findByDepartmentId(Long id)
    {
        return departmentRepository.findById(id).get();
    }
    @Override
    public  void  deleteDepartmentById(Long id)
    {
        departmentRepository.deleteById(id);
    }
}
