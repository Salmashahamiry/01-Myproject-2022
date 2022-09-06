
package org.comit.course.controller;

import org.comit.course.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@GetMapping("/Signin")
	public String showCustomersPage() {
		System.out.println("login page successfully ");
		return "Login";
	}

	@GetMapping("/login")
	public String showlogin() {
		System.out.println("login page successfully ");
		return "Login";
	}

	
	
	
	@PostMapping("/login")
	public String show(@RequestParam String username, @RequestParam String password) {

		//String Authentication = "";
		if ((username.contentEquals("admin@gmail.com"))&&( password.contentEquals("1234"))) {
		//	Authentication = "Admin";
			System.out.println("signin successfully");
			return "index";
		} else {
		//	Authentication = "tryagain";
			System.out.println("not admin try again");
			return "Login";

		}

	}
}
