package com.vti.academy.entity;

public class Department {
    private int id;
    private String name;

    public Department(){

    }

    public Department(String nameDepartment){
        this.id = 0;
        this.name = nameDepartment;
    }

    public String getDepartmentName(String name){
        return name;
    }
}
