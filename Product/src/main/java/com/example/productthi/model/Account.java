package com.example.productthi.model;

public class Account {
    private int idu ;
    private String user ;
    private String pass ;
    private int idadmin ;

    public Account() {
    }

    public Account(int idu, String user, String pass, int idadmin) {
        this.idu = idu;
        this.user = user;
        this.pass = pass;
        this.idadmin = idadmin;
    }

    public int getIdu() {
        return idu;
    }

    public void setIdu(int idu) {
        this.idu = idu;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }
}
