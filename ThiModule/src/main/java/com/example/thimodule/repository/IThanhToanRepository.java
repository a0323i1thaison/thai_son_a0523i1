package com.example.thimodule.repository;

import com.example.thimodule.model.ThanhToan;

import java.util.List;

public interface IThanhToanRepository {
    public List<ThanhToan> findAll();
}
