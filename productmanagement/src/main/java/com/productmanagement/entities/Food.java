package com.productmanagement.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Food {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="foodId", length=10, nullable=false)
	private int id;
	
	@Column(name="foodName", length=20, nullable=false)
	private String name;
	
	@Column(name="foodImage", length=20, nullable=false)
	private String image;
	
	@Column(name="foodCity", length=20, nullable=false)
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Food(int id, String name, String image, String city) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.city = city;
	}

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
