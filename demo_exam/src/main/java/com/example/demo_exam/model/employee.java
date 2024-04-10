package com.example.demo_exam.model;

import java.sql.Date;

public class employee {
    private int ma_nhan_vien ;
    private String name ;
    private Date ngay_sinh;
    private int gioi_tinh;
    private int cmnd;
    private int sdt ;
    private String dia_chi;

    public int getMa_nhan_vien() {
        return ma_nhan_vien;
    }

    public void setMa_nhan_vien(int ma_nhan_vien) {
        this.ma_nhan_vien = ma_nhan_vien;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(Date ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public int getGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(int gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public employee() {
    }

    public employee(int ma_nhan_vien, String name, Date ngay_sinh, int gioi_tinh, int cmnd, int sdt, String dia_chi) {
        this.ma_nhan_vien = ma_nhan_vien;
        this.name = name;
        this.ngay_sinh = ngay_sinh;
        this.gioi_tinh = gioi_tinh;
        this.cmnd = cmnd;
        this.sdt = sdt;
        this.dia_chi = dia_chi;
    }
}
