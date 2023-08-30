package com.productmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productmanagement.entities.Food;
import com.productmanagement.entities.Institute;
import com.productmanagement.service.FoodService;

@RestController
public class FoodController {
	
	@Autowired
	private FoodService foodService;
	
	@PostMapping("/addFood")
	public Food addFood(@RequestBody Food food) {
		return foodService.addFood(food);
	}
	
	@PostMapping("/addFoods")
	public List<Food> addFoods(@RequestBody List<Food> food){
		return foodService.addFoods(food);
	}
	
	@GetMapping("/getFoods")
	public List<Food> getFoods(){
		return foodService.getFoods();
	}
	
	@GetMapping("/getFoodByName/{name}")
	public Food getFoodByName(@PathVariable String name){
		return foodService.getFoodByName(name);
	}
	
	@GetMapping("/getFoodByCity/{city}")
	public Food getFoodByCity(@PathVariable String city) {
		return foodService.getFoodByCity(city);	
	}
	
	@DeleteMapping("/deleteFood/{name}")
	public String deleteFood(@PathVariable String name) {
		return foodService.deleteFood(name);
	}
	
	@PutMapping("/updateFood")
	public Food updateFood(@RequestBody Food food) {
		return foodService.updateFood(food);
	}

}
