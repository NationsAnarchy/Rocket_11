package com.vti.academy.entity;

import com.vti.academy.utils.ScannerUtils;

public class Department {
    private int id;
    private String name;

    public Department() {
        inputInfo();
    }

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private void inputInfo() {
        System.out.println("Nhập vào id phòng ban: ");
        id = ScannerUtils.inputInt("Nhập vào không phù hợp, mời nhập lại.");
        System.out.println("Nhập vào tên phòng ban: ");
        name = ScannerUtils.inputString("Nhập vào không phù hợp, mời nhập lại.");
    }

    @Override
    public String toString() {
        return "Department ID: " + id + ", " + "Department name: " + name;
    }
}
