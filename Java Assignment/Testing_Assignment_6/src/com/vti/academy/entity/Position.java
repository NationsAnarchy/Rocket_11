package com.vti.academy.entity;

import com.vti.academy.utils.ScannerUtils;

public class Position {
    private int id;
    private String name;

    public Position() {
        inputInfo();
    }

    public Position(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private void inputInfo() {
        System.out.println("Nhập vào id vị trí: ");
        id = ScannerUtils.inputInt("Nhập vào không phù hợp, mời nhập lại.");
        System.out.println("Nhập vào tên vị trí: ");
        name = ScannerUtils.inputString("Nhập vào không phù hợp, mời nhập lại.");
    }

    @Override
    public String toString() {
        return "Position ID: " + id + ", " + "Position name: " + name;
    }
}
