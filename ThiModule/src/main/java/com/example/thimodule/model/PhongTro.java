package com.example.thimodule.model;

public class PhongTro {
    private int id;
    private String name;
    private String phoneNumber;
    private String startDate;
    private String description;
    private int PaymentType;

    public PhongTro() {
    }

    public PhongTro(int id, String name, String phoneNumber, String startDate, String description, int PaymentType) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.startDate = startDate;
        this.description = description;
        this.PaymentType = PaymentType;
    }

    public PhongTro(String name, String phoneNumber, String startDate, String description, int thanhtoan) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.startDate = startDate;
        this.description = description;
        this.PaymentType = thanhtoan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getPaymentType() {
        return PaymentType;
    }

    public void setPaymentType(int paymentType) {
        PaymentType = paymentType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
