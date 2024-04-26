package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {
	Product save(Product p);
	List<Product>findAll();
	Product findById(int id);
	List<Product>findByIdOrName(int id,String name);
	Product findByIdAndName(int id,String name);
	}
