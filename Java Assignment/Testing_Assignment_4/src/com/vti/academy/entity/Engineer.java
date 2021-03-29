package com.vti.academy.entity;

public class Engineer extends Worker {
    private String NganhDaoTao;

    public Engineer(int id, String hoTen, int tuoi, boolean gioiTinh, String diaChi, String nganhDaoTao) {
        super(id, hoTen, tuoi, gioiTinh, diaChi);
        NganhDaoTao = nganhDaoTao;
    }

    public Engineer() {
        super();
        insertInfo();
    }
}
