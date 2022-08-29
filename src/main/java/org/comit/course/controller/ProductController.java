package org.comit.course.controller;

import org.comit.course.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {

	@Autowired
	ProductService Productservice;
}
