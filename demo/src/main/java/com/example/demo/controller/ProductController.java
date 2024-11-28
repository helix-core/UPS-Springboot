package com.example.demo.controller;
import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Product;
import com.example.demo.services.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
//	@GetMapping("/category")
//	public List<Map<String,Object>> getAllProducts(){
//		return Arrays.asList(
//				Map.of("name","product 1","price",534),
//				Map.of("name","product 2","price",134)
//		);
//				
//	}
	@GetMapping("/products")
	public List<Product> getAllProducts(){
			return productService.getAllProducts();
	}
	
	@GetMapping("/products/category")
	public List<Map<String,Object>> getAllProds(){
		return Arrays.asList(
				Map.of("name","product 1","price",234),
				Map.of("name","product 2","price",134)
		);
	}
	
	@GetMapping("/products/test")
	public List<String> showProds() {
		List<Product>allProds=productService.getAllProducts();
		List<String> newList=new ArrayList<String>();
		for(Product prod: allProds) {
			newList.add("Product: "+prod.name);
		}
		return newList;
	}
	
	@GetMapping("/products/sort")
	public List<Product> sortProds() {
		return productService.sortAllProducts();
	}
	
	@GetMapping("/products/newsort")
	public List<Product> sortProducts() {
		return productService.sortingProds();
	}
}
