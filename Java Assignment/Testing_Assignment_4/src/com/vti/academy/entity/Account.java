package com.vti.academy.entity;

import java.time.LocalDate;

public class Account {
    private int id;
    private String email;
    private String username;
    private String fullName;
    private Department department;
    private Position position;
    private LocalDate createDate;
    private Group[] groups;

    public Account() {
    }

    public Account(int id, String email, String username, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullName = firstName + " " + lastName;
    }

    public Account(String email, String username, String firstName, String lastName, Position position) {
        this.email = email;
        this.username = username;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = LocalDate.now();
    }

    public Account(int id, String email, String username, String firstName, String lastName, Position position,
            LocalDate createDate) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = createDate;
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }
}
