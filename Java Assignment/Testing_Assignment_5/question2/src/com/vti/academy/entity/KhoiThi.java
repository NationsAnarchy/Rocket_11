package com.vti.academy.entity;

public class KhoiThi {
    private String tenKhoi;
    private String monThi;

    public String getMonThi() {
        switch (tenKhoi) {
            case "A":
                monThi = "Toán, Lý, Hóa";
                break;
            case "B":
                monThi = "Toán, Hóa, Sinh";
                break;
            case "C":
                monThi = "Văn, Sử, Địa";
                break;
            default:
                monThi = "Không có môn thi với khối";
                break;
        }
        return monThi;
    }

    public String getTen() {
        return tenKhoi;
    }

    public void setTen(String tenKhoi) {
        this.tenKhoi = tenKhoi;
    }
}
