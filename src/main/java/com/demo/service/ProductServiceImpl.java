package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.exception.NoProductFoundException;
import com.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public Product findProduct(int pid) {
		// TODO Auto-generated method stub
		if (pid == 101) {
			return new Product(101, "My First Book", "Sandya");
		} else {

			throw new NoProductFoundException("Requested Book Not Found");
		}

	}

}
