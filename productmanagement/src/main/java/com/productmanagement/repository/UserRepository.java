package com.productmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productmanagement.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByName(String name);

}
