package com.example.springs.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springs.model.Product;
import com.example.springs.repositories.ProductsRepository;

@Service
public class ProductService {

@Autowired
private ProductsRepository productRepository;

public List<Product> getAllProducts(){
	return productRepository.findAll();
}
}