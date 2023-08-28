package com.productmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productmanagement.entities.Product;
import com.productmanagement.entities.User;
import com.productmanagement.repository.ProductRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	
	public List<Product> addProducts(List<Product> product){
		return productRepository.saveAll(product);
	}
	
	public Product getProductById(int id) {
		return productRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Product not found with ID: " + id));
	}
	
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
	
	public Product getProductByProductName(String productName) {
		return productRepository.findByProductName(productName);
	}
	
	public String deleteProduct(int id) {
		productRepository.deleteById(id);
		return "Product removed";
	}
	
	public Product updateUser(Product product) {
		Product existingProduct=productRepository.findById(product.getId()).orElseThrow(() -> new EntityNotFoundException("User not found with ID: " + product));
		existingProduct.setProductName(product.getProductName());
		existingProduct.setProductImage(product.getProductImage());
		return productRepository.save(existingProduct);
	}

}
