package com.productmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productmanagement.entities.Institute;
import com.productmanagement.entities.User;
import com.productmanagement.repository.InstituteRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class InstituteService {
	
	@Autowired
	private InstituteRepository instituteRepository;
	
	public Institute addInstitute(Institute institute) {
		return instituteRepository.save(institute);
	}
	
	public List<Institute> addInstitutes(List<Institute> institute){
		return instituteRepository.saveAll(institute);
	}
	
	public List<Institute> getInstitutes(){
		return instituteRepository.findAll();
	}
	
	public Institute getInstituteByName(String name) {
		if(instituteRepository.findByName(name)==null)
			throw new EntityNotFoundException("Institute not found with ID: " + name);
		else
			return instituteRepository.findByName(name);
		 
	}
	
	public Institute getInstituteByCity(String city) {
		if(instituteRepository.findByCity(city)==null)
			throw new EntityNotFoundException("Institute not found with ID: " + city);
		else
			return instituteRepository.findByName(city);
		 
	}
	
	
	public String deleteInstitute(String name) {
		instituteRepository.deleteByName(name);
		return "Institute removed";
	}
	
	public Institute updateInstitute(Institute institute) {
		Institute existingInstitute=instituteRepository.findById(institute.getId()).orElseThrow(() -> new EntityNotFoundException("Institute not found with ID: " + institute));
		existingInstitute.setName(institute.getName());
		existingInstitute.setImage(institute.getImage());
		existingInstitute.setImage(institute.getCity());
		return instituteRepository.save(existingInstitute);
	}

}
