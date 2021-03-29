package com.vti.academy.entity;

public class Staff extends Worker {
    private String CongViec;

    public Staff(int id, String hoTen, int tuoi, boolean gioiTinh, String diaChi, String congViec) {
        super(id, hoTen, tuoi, gioiTinh, diaChi);
        this.CongViec = congViec;
    }

    public Staff() {
        super();
        insertInfo();
    }
}
