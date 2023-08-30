package com.productmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productmanagement.entities.Food;
import com.productmanagement.entities.Institute;
import com.productmanagement.repository.FoodRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class FoodService {
	
	@Autowired
	private FoodRepository foodRepository;
	
	public Food addFood(Food institute) {
		return foodRepository.save(institute);
	}
	
	public List<Food> addFoods(List<Food> institute){
		return foodRepository.saveAll(institute);
	}
	
	public List<Food> getFoods(){
		return foodRepository.findAll();
	}
	
	public Food getFoodByName(String name) {
		if(foodRepository.findByName(name)==null)
			throw new EntityNotFoundException("Item not found with name: " + name);
		else
			return foodRepository.findByName(name);
		 
	}
	
	public Food getFoodByCity(String city) {
		if(foodRepository.findByCity(city)==null)
			throw new EntityNotFoundException("Item not found in city: " + city);
		else
			return foodRepository.findByName(city);
		 
	}
	
	
	public String deleteFood(String name) {
		foodRepository.deleteByName(name);
		return "Item removed";
	}
	
	public Food updateFood(Food food) {
		Food existingFood=foodRepository.findById(food.getId()).orElseThrow(() -> new EntityNotFoundException("Item not found with ID: " + food));
		existingFood.setName(food.getName());
		existingFood.setImage(food.getImage());
		existingFood.setImage(food.getCity());
		return foodRepository.save(existingFood);
	}


}
