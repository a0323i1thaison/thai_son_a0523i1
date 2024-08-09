package com.example.productthi.service;

import com.example.productthi.model.Category;
import com.example.productthi.repository.CategoryRepository;
import com.example.productthi.repository.ICategoryRepository;

import java.util.List;

public class CategoryService implements ICategoryService{
    private ICategoryRepository categoryRepository = new CategoryRepository();
    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
