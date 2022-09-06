package org.comit.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pagesController {

	@GetMapping( "/page1_shopping")
	public String index() {

		System.out.println(" Show page1");

		return "page1_shopping";

	}

	@GetMapping( "/aboutus")
	public String aboutUs() {

		System.out.println(" Show aboutus");

		return "aboutus";

	}

	@GetMapping( "/contactus")
	public String contactUs() {

		System.out.println(" Show contact");

		return "contactus";

	}
	@GetMapping( "/shopping")
	public String shopping() {

		System.out.println(" shopping page");

		return "shopping";

	}

}
