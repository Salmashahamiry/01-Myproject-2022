package org.comit.course.controller;

import org.comit.course.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
	@Autowired
	CustomerService Customerservice;

	@GetMapping("/Customers")
	public String showCustomersPage()
	{
		System.out.println("Customers page successfully linked");
		return "Customers";
	}
}
