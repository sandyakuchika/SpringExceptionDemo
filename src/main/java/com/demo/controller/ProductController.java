package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping(value="/findproduct", produces="application/json")
	public Product findProduct(@RequestParam("pid") String pid) {
		int id=Integer.parseInt(pid);
		return productService.findProduct(id);
		
	}
	
}
