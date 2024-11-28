package com.example.springs.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="new_prod")
public class Product {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private String brand;
	private String category;
	private double price;
	
	public Product() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Product(String name,String brand, String category, double price, String description, Date createdAt, String imageField) {
		super();
		this.name=name;
		this.brand=brand;
		this.category=category;
		this.price=price;
		this.description=description;
		this.createdAt=createdAt;
		this.imageField=imageField;
	}
	@Column(columnDefinition="text")
	private String description;
	private Date createdAt;
	private String imageField;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
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
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getImageField() {
		return imageField;
	}
	public void setImageField(String imageField) {
		this.imageField = imageField;
	}
}
