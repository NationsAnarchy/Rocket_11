package com.vti.academy.entity;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private double grade;

    public Student(int id, String name, String hometown) {
        this.id = id;
        this.name = name;
        this.hometown = hometown;
        this.grade = 0.0;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void addGrade(double grade) {
        this.grade += grade;
    }

    public String toString() {
        String level;
        if (grade <= 4.0) {
            level = "Yếu";
        } else if (grade <= 6) {
            level = "Trung bình";
        } else if (grade <= 8) {
            level = "Khá";
        } else {
            level = "Giỏi";
        }

        return "Tên sinh viên " + name + ", " + "ID: " + id + ", " + "Điểm: " + grade + ", " + "Xếp loại: " + level;
    }
}
