package com.vti.academy.entity;

public class CanBo {
    protected int Id;
    protected String HoTen;
    protected int Tuoi;
    protected boolean GioiTinh;
    protected String DiaChi;

    public CanBo(int id, String hoTen, int tuoi, boolean gioiTinh, String diaChi) {
        Id = id;
        HoTen = hoTen;
        Tuoi = tuoi;
        GioiTinh = gioiTinh;
        DiaChi = diaChi;
    }
}
