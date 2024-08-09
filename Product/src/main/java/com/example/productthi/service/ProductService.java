package com.example.productthi.service;

import com.example.productthi.dto.ProductDto;
import com.example.productthi.model.Product;
import com.example.productthi.repository.IProductRepository;
import com.example.productthi.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService{
    private IProductRepository productRepository = new ProductRepository();
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<ProductDto> findAllDto() {
        return productRepository.findAllDto();
    }

    @Override
    public boolean add(Product product) {
        return productRepository.add(product);
    }

    @Override
    public boolean deleteById(int id) {
        return productRepository.deleteById(id);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public boolean update(Product product) {
        return productRepository.update(product);
    }

    @Override
    public List<ProductDto> search(String name, int category) {
        return productRepository.search(name, category);
    }
}
