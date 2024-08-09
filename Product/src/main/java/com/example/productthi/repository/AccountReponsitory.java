package com.example.productthi.repository;

public class AccountReponsitory {
    private static final String GET_ALL = "SELECT * FROM productthi.accounts\n" +
            "WHERE user = '?' \n" +
            "  AND pass = '?'\n";

}
