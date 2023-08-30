package com.productmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productmanagement.entities.Food;

public interface FoodRepository extends JpaRepository<Food, Integer>{
	
	Food findByName(String name);
	Food findByCity(String city);
	Food deleteByName(String name);

}
