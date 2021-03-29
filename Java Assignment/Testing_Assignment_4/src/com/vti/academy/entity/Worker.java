package com.vti.academy.entity;

import java.util.Scanner;

public abstract class Worker {
    protected int Id;
    protected String HoTen;
    protected int Tuoi;
    protected boolean GioiTinh;
    protected String DiaChi;

    public Worker(int id, String hoTen, int tuoi, boolean gioiTinh, String diaChi) {
        Id = id;
        HoTen = hoTen;
        Tuoi = tuoi;
        GioiTinh = gioiTinh;
        DiaChi = diaChi;
    }

    public Worker() {
    }

    public String getHoTen() {
        return HoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void insertInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào tên: ");
        HoTen = scanner.nextLine();
        System.out.println("Mời bạn nhập vào tuổi: ");
        Tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Mời bạn nhập vào giới tính: ");
        String gender = scanner.nextLine();
        GioiTinh = gender.equals("Nam") ? true : false;
    }
}
