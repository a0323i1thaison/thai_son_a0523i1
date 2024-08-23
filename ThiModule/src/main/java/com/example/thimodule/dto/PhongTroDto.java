package com.example.thimodule.dto;

public class PhongTroDto {
    private int id;
    private String name;
    private String phoneNumber;
    private String startDate;
    private String description;
    private String PaymentType;

    public PhongTroDto() {
    }

    public PhongTroDto(int id, String name, String phoneNumber, String startDate, String description, String PaymentType) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.startDate = startDate;
        this.description = description;
        this.PaymentType = PaymentType;
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

    public String getPaymentType() {
        return PaymentType;
    }

    public void setPaymentType(String paymentType) {
        PaymentType = paymentType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
