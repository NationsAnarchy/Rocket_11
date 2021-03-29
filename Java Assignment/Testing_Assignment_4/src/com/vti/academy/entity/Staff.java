package com.vti.academy.entity;

public class NhanVien extends CanBo {
    private String CongViec;

    public NhanVien(int id, String hoTen, int tuoi, boolean gioiTinh, String diaChi, String congViec) {
        super(id, hoTen, tuoi, gioiTinh, diaChi);
        this.CongViec = congViec;
    }
}
