package org.comit.course.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.comit.course.Util.Util;
import org.comit.course.bean.Product;
import org.comit.course.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

	@GetMapping("/showproduct/{id}")
	public ModelAndView showProduct(@PathVariable("id") int id) {

		System.out.println("Show Update page product");

		Product product = this.Productservice.findProduct(id);

		return new ModelAndView("updateproduct", "product", product);
	}

	@PostMapping("/updateproduct")
	public String updateproduct(HttpServletRequest request) {
		System.out.println("Update customer DONE");

		String id = request.getParameter("productId");
		String productname = request.getParameter("productName");
		String qty = request.getParameter("qty");
		String price = request.getParameter("price");
		String image = request.getParameter("image");

		Product product = this.createProduct(id, productname, qty, price, image);

		this.Productservice.modifyProduct(product);

		return "redirect:/Products";
	}

	private Product createProduct(String id, String productname, String qty, String price, String image) {

		Product product = new Product(Util.parseId(id), productname, Util.parseId(qty), Util.parsedouble(price), image);

		return product;
	}

	@GetMapping("/createp")
	public String showCreate() {

		return "createproduct";
	}

	@PostMapping("/createp")
	public String createProduct(HttpServletRequest request) {

		String productname = request.getParameter("productname");
		String qty = request.getParameter("qty");
		String price = request.getParameter("price");
		String image = request.getParameter("image");

		Product product = this.createProduct(null, productname, qty, price, image);

		this.Productservice.createProduct(product);

		return "redirect:/Products";

	}

	@GetMapping("/deleteproduct/{id}")
	public String deleteProduct(@PathVariable("id") int id) {

		this.Productservice.deleteProduct(id);

		return "redirect:/Products";
	}

}
