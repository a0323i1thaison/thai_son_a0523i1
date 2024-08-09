package com.example.productthi.model;

public class TypeAccount {
    private int ida ;
    private String typeaccount ;

    public TypeAccount() {
    }

    public TypeAccount(int ida, String typeaccount) {
        this.ida = ida;
        this.typeaccount = typeaccount;
    }

    public int getIda() {
        return ida;
    }

    public void setIda(int ida) {
        this.ida = ida;
    }

    public String getTypeaccount() {
        return typeaccount;
    }

    public void setTypeaccount(String typeaccount) {
        this.typeaccount = typeaccount;
    }
}
