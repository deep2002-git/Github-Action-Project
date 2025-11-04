package com.example.APIs_for_Testing.controller;


import com.example.APIs_for_Testing.entity.DepartmentManual;
import com.example.APIs_for_Testing.repository.DepartmentRepository;
import com.example.APIs_for_Testing.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

//    @PostMapping("/departments")
//     public DepartmentManual saveDepartment(  @Valid @RequestBody DepartmentManual department){
//        return departmentService.saveDepartment(department);
//    }
    // Save operation
    @PostMapping("/departments")

    public DepartmentManual saveDepartment(
            @Valid @RequestBody DepartmentManual department)
    {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/department")
    public List<DepartmentManual> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    @PutMapping("/departments/{id}")
    public DepartmentManual updateDepartment( @RequestBody DepartmentManual department , @PathVariable Long id){
       return departmentService.updateDepartment(department, id);
    }
    @GetMapping("/departments/{id}")
    public DepartmentManual fetchDepartmentById(@PathVariable Long id){
        return departmentService.findByDepartmentId(id);
    }
    @DeleteMapping("/departments/{id}")
    public String  deleteDepartment(@PathVariable Long id){
        departmentService.deleteDepartmentById(id);
        return "Deleted Successfully";
    }


}
