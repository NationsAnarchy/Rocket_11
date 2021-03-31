package com.vti.academy.entity;

import java.util.Scanner;

public class Examinee {
    private String examineeCode;
    private String name;
    private String address;
    private int level;
    private KhoiThi khoiThi;

    public String getExamineeCode() {
        return examineeCode;
    }

    public void insertInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số báo danh thí sinh: ");
        examineeCode = scanner.nextLine();

        System.out.println("Nhập vào họ tên thí sinh: ");
        name = scanner.nextLine();

        System.out.println("Nhập vào địa chỉ: ");
        address = scanner.nextLine();

        System.out.println("Nhập vào mức độ ưu tiên: ");
        level = scanner.nextInt();
    }
}
