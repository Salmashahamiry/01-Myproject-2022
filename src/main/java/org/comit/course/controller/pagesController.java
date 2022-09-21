package org.comit.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pagesController {

	@GetMapping("/page1_shopping")
	public String index() {

		return "page1_shopping";

	}

	@GetMapping("/aboutus")
	public String aboutUs() {

		return "aboutus";

	}

	@GetMapping("/contactus")
	public String contactUs() {

		return "contactus";

	}
}
