package com.vti.academy.backend;

import com.vti.academy.entity.Examinee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {

    private Scanner scanner;

    private List<Examinee> examineeList;

    public TuyenSinh() {
        examineeList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    @Override
    public void addExaminee() {
        System.out.println("Nhập số thí sinh muốn nhập: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            Examinee examinee = new Examinee();
            examinee.insertInfo();
            examineeList.add(examinee);
        }
    }

    @Override
    public void showExaminee() {
        for (Examinee examinee : examineeList) {
            System.out.println(examinee);
        }
    }

    @Override
    public void findExaminee() {
        System.out.println("Nhập vào số báo danh cần tìm kiếm: ");
        String examineeCode = scanner.nextLine();

        for (Examinee examinee : examineeList){
            if(examinee.getExamineeCode().equals(examineeCode)){
                System.out.println(examinee);
            }
        }
    }
}
