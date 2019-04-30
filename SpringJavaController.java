package com.naveen.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.app.model.Product;
import com.naveen.app.repository.ProductRepository;

@RestController
public class SpringJavaController {
	
	@Autowired
	ProductRepository productRepository;

	@RequestMapping("/")
	public List<Product> welcome() {
		return (List<Product>) productRepository.findAll();
	}
	@RequestMapping("/product/{id}")
	public Product welcome(@PathVariable("id") Long id) {
		return productRepository.findOne(id);
	}
	
	@RequestMapping("/hello")
	public String myData() {
		return "Hello Spring Boot";
	}
}