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

import com.productmanagement.entities.Institute;
import com.productmanagement.entities.User;
import com.productmanagement.service.InstituteService;

@RestController
public class InstituteController {
	
	@Autowired
	private InstituteService instituteService;
	
	@PostMapping("/addInstitute")
	public Institute addInstitute(@RequestBody Institute institute) {
		return instituteService.addInstitute(institute);
	}
	
	@PostMapping("/addInstitutes")
	public List<Institute> addInstitutes(@RequestBody List<Institute> institute){
		return instituteService.addInstitutes(institute);
	}
	
	@GetMapping("/getInstitutes")
	public List<Institute> getInstitutes(){
		return instituteService.getInstitutes();
	}
	
	@GetMapping("/getInstituteByName/{name}")
	public Institute getInstituteByName(@PathVariable String name){
		return instituteService.getInstituteByName(name);
	}
	
	@GetMapping("/getInstituteByCity/{city}")
	public Institute getInstituteByCity(@PathVariable String city) {
		return instituteService.getInstituteByCity(city);	
	}
	
	@DeleteMapping("/deleteInstitute/{name}")
	public String deleteInstitute(@PathVariable String name) {
		return instituteService.deleteInstitute(name);
	}
	
	@PutMapping("/updateInstitute")
	public Institute updateInstitute(@RequestBody Institute institute) {
		return instituteService.updateInstitute(institute);
	}
}
