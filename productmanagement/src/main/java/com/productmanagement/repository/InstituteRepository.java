package com.productmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productmanagement.entities.Institute;
import com.productmanagement.entities.User;

@Repository
public interface InstituteRepository extends JpaRepository<Institute, Integer>{
	
	Institute findByName(String name);
	Institute findByCity(String city);
	Institute deleteByName(String name);

}
