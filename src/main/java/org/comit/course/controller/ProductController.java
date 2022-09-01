package org.comit.course.controller;

import org.comit.course.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

	@Autowired
	ProductService Productservice;
	
	
	@GetMapping("/Products")
	public String showProductsPage()
	{
		System.out.println("Products page successfully linked");
		return "Products";
	}
}
