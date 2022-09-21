package org.comit.course.controller;

import java.util.List;

import org.comit.course.bean.Order;
import org.comit.course.bean.Product;
import org.comit.course.service.OrderService;
import org.comit.course.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {
	@Autowired
	OrderService Orderservice;

	@Autowired
	ProductService Productservice;

//	@GetMapping("/Orders")
	// public String showOrdersPage() {
	// return "Orders";
//	}

	@GetMapping("/shopping")
	public ModelAndView shopping() {

		List<Product> products = this.Productservice.listProducts();
		return new ModelAndView("shopping", "products", products);

	}

	@GetMapping("/mycartgetid/{id}")
	public ModelAndView showProductinfo(@PathVariable("id") int id) {

		Product product = this.Productservice.findProduct(id);
		return new ModelAndView("mycartgetid", "product", product);
	}

	@GetMapping("/mycart")
	public String showmycart() {
// shoelist order
		// Product product = this.Productservice.findProduct(id);
		return "mycart";
	}

	@GetMapping("/Orders")
	public ModelAndView showProductsPage() {
		List<Order> orders = this.Orderservice.listOrders();
		

		return new ModelAndView("Orders", "orders", orders);

	}
	
	@GetMapping("/deleteorder/{id}")
	public String deleteOrder(@PathVariable("id") int id) {


		this.Orderservice.deleteOrder(id);

		return "redirect:/Orders";
	}


	

}
