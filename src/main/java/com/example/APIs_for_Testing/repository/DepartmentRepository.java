package com.example.APIs_for_Testing.repository;

import com.example.APIs_for_Testing.entity.DepartmentManual;
import org.springframework.data.jpa.repository.JpaRepository;



public interface   DepartmentRepository extends JpaRepository<DepartmentManual, Long> {

}
