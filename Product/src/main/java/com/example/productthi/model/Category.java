package com.example.productthi.model;

public class Category {
 private int id;
 private String danhmuc;

    public Category() {
    }

    public Category(int id, String danhmuc) {
        this.id = id;
        this.danhmuc = danhmuc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDanhmuc() {
        return danhmuc;
    }

    public void setDanhmuc(String danhmuc) {
        this.danhmuc = danhmuc;
    }
}
