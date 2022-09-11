package org.comit.course.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.comit.course.Util.Util;
import org.comit.course.bean.Customer;
import org.comit.course.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	@Autowired
	CustomerService Customerservice;

	/*
	 * @GetMapping("/Customers") public String showCustomersPage() {
	 * System.out.println("Customers page successfully linked"); return "Customers";
	 * }
	 */
	@GetMapping("/Customers")
	public ModelAndView listCustomers() {
		System.out.println("Listcustomers");

		List<Customer> customers = this.Customerservice.listCustomers();
		System.out.println(customers);
		return new ModelAndView("Customers", "customers", customers);
	}

	@GetMapping("/showcustomer/{id}")
	public ModelAndView showCustomer(@PathVariable("id") int id) {

		System.out.println("Show Update page");

		Customer customer = this.Customerservice.findCustomer(id);

		return new ModelAndView("updatecustomer", "customer", customer);
	}

	@PostMapping("/update")
	public String updateCustomer(HttpServletRequest request) {
		System.out.println("Update customer");

		String id = request.getParameter("id");
		String first = request.getParameter("first");
		String last = request.getParameter("last");
		String phone = request.getParameter("phone");
		String postalCode = request.getParameter("postalCode");

		Customer customer = this.createCustomer(id, first, last, phone, postalCode);

		this.Customerservice.modifyCustomer(customer);

		return "redirect:/Customers";
	}

	private Customer createCustomer(String id, String first, String last, String phone, String postalcode) {

		Customer customer = new Customer(Util.parseId(id), first.trim(), last.trim(), phone.trim(), postalcode.trim());

		return customer;
	}

	@GetMapping("/create")
	public String showCreate() {
		System.out.println("Show Create");

		return "createcustomer";
	}

	@PostMapping("/create")
	public String createCustomer(HttpServletRequest request) {
		System.out.println("Create customer");

		String first = request.getParameter("first");
		String last = request.getParameter("last");
		String phone = request.getParameter("phone");
		String postalcode = request.getParameter("postalCode");

		Customer customer = this.createCustomer(null, first, last, phone, postalcode);

		this.Customerservice.createCustomer(customer);

		return "redirect:/Customers";

	}
	
	@GetMapping("/deletecustomer/{id}")
	public String deleteCustomer(@PathVariable("id") int id) {
		System.out.println("Delete customer");

		this.Customerservice.deleteCustomer(id);

		return "redirect:/Customers";
	}

}