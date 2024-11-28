package com.example.demo.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.models.Product;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductService {

@Autowired
private ProductRepository productRepository;

public List<Product> getAllProducts(){
	return productRepository.findAll();
}

public List<Product> sortAllProducts(){
	List<Product>allProds=productRepository.findAll();
	allProds.sort(Comparator.comparingInt(Product::getNumOfReviews));
	return allProds;
}

public List<Product> sortingProds(){
	return productRepository.findAll(Sort.by(Sort.Order.asc("name")));
}
}
