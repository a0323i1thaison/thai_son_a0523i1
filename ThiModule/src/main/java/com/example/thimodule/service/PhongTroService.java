package com.example.thimodule.service;

import com.example.thimodule.dto.PhongTroDto;
import com.example.thimodule.model.PhongTro;
import com.example.thimodule.repository.IPhongTroRepository;
import com.example.thimodule.repository.PhongTroRepository;

import java.util.List;

public class PhongTroService implements IPhongTroService{
    private IPhongTroRepository phongTroRepository = new PhongTroRepository();
    @Override
    public List<PhongTro> findAll() {
        return phongTroRepository.findAll();
    }

    @Override
    public List<PhongTroDto> findAllDto() {
        return phongTroRepository.findAllDto();
    }

    @Override
    public boolean add(PhongTro phongTro) {
        return phongTroRepository.add(phongTro);
    }

    @Override
    public boolean deleteById(int id) {
        return phongTroRepository.deleteById(id);
    }

    @Override
    public PhongTro findById(int id) {
        return phongTroRepository.findById(id);
    }



    @Override
    public List<PhongTroDto> search(String name, int PaymentType) {
        return phongTroRepository.search(name, PaymentType);
    }
}
