package com.vti.academy.entity;

public class KySu extends CanBo {
    private String NganhDaoTao;

    public KySu(int id, String hoTen, int tuoi, boolean gioiTinh, String diaChi, String nganhDaoTao) {
        super(id, hoTen, tuoi, gioiTinh, diaChi);
        this.NganhDaoTao = nganhDaoTao;
    }
}
