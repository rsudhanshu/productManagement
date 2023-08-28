package com.productmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productmanagement.entities.Product;
import com.productmanagement.entities.User;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	Product findByProductName(String productName);

}
