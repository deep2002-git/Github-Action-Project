package com.example.APIs_for_Testing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class DepartmentManual {
    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long departmentId ;
    private String departmentName;
    private String departmentAddress;
    private  String departmentCode;




    public Long getDepartmentId() {
        return departmentId;
    }

    public   void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;

    }

    public   String getDepartmentName() {
        return departmentName;
    }
    public void  setDepartmentName(String departmentName){
        this.departmentName = departmentName;

    }
    public   String getDepartmentAddress() {
        return departmentAddress;
    }
    public void  setDepartmentAddress(String departmentAddress){
        this.departmentAddress = departmentAddress;
    }
    public   String getDepartmentCode() {
        return departmentCode;
    }
    public void  setDepartmetCode(String departmetCode){
        this.departmentCode = departmentCode;
    }
    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }
}
