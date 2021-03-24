package com.vti.academy.entity;

public class Student {
    private int id;
    private String name;
    private int[] points;

    public void setPoints(int[] points){
        this.points = points;
    }

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

}
