package com.example.thimodule.repository;

import com.example.thimodule.dto.PhongTroDto;
import com.example.thimodule.model.PhongTro;

import java.util.List;

public interface IPhongTroRepository {
    public List<PhongTro> findAll();

    public List<PhongTroDto> findAllDto();

    public boolean add(PhongTro phongTro);

    public boolean deleteById(int id);

    public PhongTro findById(int id);

    List<PhongTroDto> search(String name, int PaymentType);
}
