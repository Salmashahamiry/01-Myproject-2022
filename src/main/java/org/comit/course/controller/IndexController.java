
package org.comit.course.controller;

import org.comit.course.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class  IndexController{
	@Autowired
	CustomerService Customerservice;

	@GetMapping({"/","/Home"})
	public String index() {

		System.out.println(" Show index page");

		return "index";
	}
	
/*	@GetMapping("/Products")
	public String showProductsPage()
	{
		System.out.println("Products page successfully linked");
		return "Products";
	}
	*/
	/*@GetMapping("/Customers")
	public String showCustomersPage()
	{
		System.out.println("Customers page successfully linked");
		return "Customers";
	}*/
	
	/*@GetMapping("/Orders")
	public String showOrdersPage()
	{
		System.out.println("Orders page successfully linked");
		return "Orders";
	}
	*/
	
}
