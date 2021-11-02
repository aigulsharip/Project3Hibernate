package com.example.project3hibernate.service;

import com.example.project3hibernate.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
}
