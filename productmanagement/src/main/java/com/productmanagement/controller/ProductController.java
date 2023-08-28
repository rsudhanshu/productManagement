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

import com.productmanagement.entities.Product;
import com.productmanagement.entities.User;
import com.productmanagement.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> product){
		return productService.addProducts(product);
	}
	
	@GetMapping("/getProducts")
	public List<Product> getProducts(){
		return productService.getProducts();
	}
	
	@GetMapping("/getProductById/{id}")
	public Product getProductById(@PathVariable int id){
		return productService.getProductById(id);
	}
	
	@GetMapping("/getProductByProductName/{name}")
	public Product getProductByProductName(@PathVariable String productName) {
		return productService.getProductByProductName(productName);	
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id) {
		return productService.deleteProduct(id);
	}
	
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
}
