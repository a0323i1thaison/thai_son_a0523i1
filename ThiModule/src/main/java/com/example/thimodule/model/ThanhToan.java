package com.example.thimodule.model;

public class ThanhToan {
    private int id;
    private String thanhtoan;

    public ThanhToan() {
    }

    public ThanhToan(int id, String thanhtoan) {
        this.id = id;
        this.thanhtoan = thanhtoan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getThanhtoan() {
        return thanhtoan;
    }

    public void setThanhtoan(String thanhtoan) {
        this.thanhtoan = thanhtoan;
    }
}
