package com.productmanagement.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="productId", length=10, nullable=false)
	private int id;
	
	@Column(name="productName", length=20, nullable=false)
	private String productName;
	
	@Column(name="productImage", length=20, nullable=false)
	private String productImage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public Product(int id, String productName, String productImage) {
		super();
		this.id = id;
		this.productName = productName;
		this.productImage = productImage;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
