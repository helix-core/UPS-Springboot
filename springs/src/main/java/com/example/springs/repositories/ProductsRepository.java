package com.example.springs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springs.model.Product;

public interface ProductsRepository extends JpaRepository<Product,Long> {

}
