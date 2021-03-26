package com.vti.academy.entity;

public class Department {
    private int id;
    private String name;

    public Department() {

    }

    public Department(String name) {
        this.id = 0;
        this.name = name;
    }

    public String getDepartmentName(String name) {
        return name;
    }
}
