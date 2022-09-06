
package org.comit.course.controller;

import org.comit.course.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@Autowired
	CustomerService Customerservice;

	@GetMapping({ "/", "/Home" })
	public String index() {

		System.out.println(" Show index page");

		return "index";
	
		}
	
	
	
	

}