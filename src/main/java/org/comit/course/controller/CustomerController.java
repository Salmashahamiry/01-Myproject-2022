package org.comit.course.controller;

import org.comit.course.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
	@Autowired
	CustomerService Customerservice;

	@GetMapping({"/","/index"})
	public String index() {

		System.out.println(" Show index page");

		return "index";
	}

}
