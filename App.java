package com.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.dao.ProductDao;
import com.demo.model.Product;
import com.demo.service.ProductService;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		
		ProductService ps = context.getBean(ProductService.class);
		
		/*
		Product p = new Product();
		p.setName("Laptop");
		p.setDescription("Hardware Device");
		p.setPrice(78000);
		
		System.out.println(ps.save(p));
		*/
		/*
		List<Product> p = ps.findAll();
		for(Product List: p)
			System.out.println(List);
		*/
		/*
		Product p=ps.findById(3);
		System.out.println(p);
		
		 */
		/*
		List<Product> p =ps.findByIdOrName(3, "Laptop");
		for(Product List:p)
			System.out.println(List);
		*/
		
		Product  p = ps.findByIdAndName(5, "pen");
		System.out.println(p);
	}
	

}
