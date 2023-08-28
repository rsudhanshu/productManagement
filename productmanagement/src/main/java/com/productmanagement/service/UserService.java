package com.productmanagement.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.productmanagement.entities.User;
import com.productmanagement.repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	public List<User> addUsers(List<User> user){
		return userRepository.saveAll(user);
	}
	
	public User getUserById(int id) {
		return userRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found with ID: " + id));
	}
	
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	public User getUserByName(String name) {
		return userRepository.findByName(name);
	}
	
	public String deleteUser(int id) {
		userRepository.deleteById(id);
		return "User removed";
	}
	
	public User updateUser(User user) {
		User existingUser=userRepository.findById(user.getId()).orElseThrow(() -> new EntityNotFoundException("User not found with ID: " + user));
		existingUser.setName(user.getName());
		existingUser.setEmail(user.getEmail());
		return userRepository.save(existingUser);
	}

}
