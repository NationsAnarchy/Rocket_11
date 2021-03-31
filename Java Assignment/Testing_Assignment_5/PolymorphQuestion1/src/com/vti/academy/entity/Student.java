package com.vti.academy.entity;

import com.vti.academy.backend.IStudent;

public class Student implements IStudent {

    private int id;
    private String name;
    private int group;

    public Student(int id, String name, int group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public void rollUp() {
        System.out.println(name + " lên điểm danh!");
    }

    @Override
    public void studyInClass() {
        System.out.println(name + " đang học trong lớp!");
    }

    @Override
    public void cleanUp() {
        System.out.println(name + " đang làm vệ sinh!");
    }
}
