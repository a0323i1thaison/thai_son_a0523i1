package com.example.productthi.service;

import com.example.productthi.dto.ProductDto;
import com.example.productthi.model.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll();
    public List<ProductDto> findAllDto();
    public boolean add(Product product);
    public boolean deleteById(int id);
    public Product findById(int id);
    public boolean update(Product product);
    List<ProductDto> search(String name, int category);
}
