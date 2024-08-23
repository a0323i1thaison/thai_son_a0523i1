package com.example.thimodule.service;

import com.example.thimodule.model.ThanhToan;
import com.example.thimodule.repository.IThanhToanRepository;
import com.example.thimodule.repository.ThanhToanRepository;

import java.util.List;

public class ThanhToanService implements IThanhToanService{
    private IThanhToanRepository thanhToanRepository = new ThanhToanRepository();
    @Override
    public List<ThanhToan> getAll() {
        return thanhToanRepository.findAll();
    }
}
