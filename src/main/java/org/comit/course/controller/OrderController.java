package org.comit.course.controller;

import org.comit.course.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {
	@Autowired
  OrderService Orderservice;
	
	
	
	@GetMapping("/Orders")
	public String showOrdersPage()
	{
		System.out.println("Orders page successfully linked");
		return "Orders";
	}
}
