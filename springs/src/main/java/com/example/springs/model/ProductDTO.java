package com.example.springs.model;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class ProductDTO {
	@NotEmpty(message="The name is required")
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String brand;
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	@NotEmpty(message="The category is required")
	private String category;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MultipartFile getImageField() {
		return imageField;
	}

	public void setImageField(MultipartFile imageField) {
		this.imageField = imageField;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	@Min(10)
	private double price;
	
	@Size(min=10,message="The description should be atleast 10 characters")
	@Size(max=1000,message="The description should be atleast 1000" + " characters")
	private String description;
	
	private MultipartFile imageField;
	
	
}
