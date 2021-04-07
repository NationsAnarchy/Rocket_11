package com.vti.academy.entity;

public class Student {
    private int id;
    private String name;
    public static String college = "ĐH Bách Khoa";
    private static int moneyGroup = 0;
    public static int count = 0;
    public static final int maxStudent = 7;

    public Student(String name) throws Exception {
        if (count > maxStudent) {
            throw new Exception ("Không được phép tạo nhiều hơn 7 sinh viên");
        }

        this.id = ++count;
        this.name = name;

        moneyGroup += 100;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static String getCollege() {
        return college;
    }

    public static int getGroupMoney() {
        return moneyGroup;
    }

    public void addMoney() {
        moneyGroup += 50;
    }

    public static void spendMoney(int money) {
        Student.moneyGroup -= money;
    }

    public static void changeCollege(String college) {
        Student.college = college;
    }

    public String toString() {
        return "Student ID: " + id + "\n" + "Student name" + name + "\n" + "Student college: " + college;
    }
}
