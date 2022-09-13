package org.comit.course.controller;

import java.util.List;

import org.comit.course.bean.Product;
import org.comit.course.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@Autowired
	ProductService Productservice;

	@GetMapping("/Products")
	public ModelAndView showProductsPage() {
		
		
		List<Product> products = this.Productservice.listProducts();
		return new ModelAndView("Products", "products", products);

		
	}

	/*
	 * public ModelAndView showCustomer(@PathVariable("id") int id) {
	 * 
	 * System.out.println("Show product page");
	 * 
	 * Product product = this.Productservice.findCustomer(id);
	 * 
	 * return new ModelAndView("updatecustomer", "product", product); }
	 */
}
