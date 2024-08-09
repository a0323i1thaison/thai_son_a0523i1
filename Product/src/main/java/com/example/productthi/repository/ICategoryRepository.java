package com.example.productthi.repository;

import com.example.productthi.model.Category;

import java.util.List;

public interface ICategoryRepository {
    List<Category> findAll();
}
