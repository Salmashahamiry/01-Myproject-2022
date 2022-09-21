package org.comit.course.bean;

import java.util.ArrayList;
import java.util.List;

public class Order {

	int orderId;
	int customerId;
//	List<Product> products = new ArrayList<>();
	
	Product product;
	Customer customer;

	public Order() {
	}

	public Order(int orderId, int customerId, String status, Product product) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

/*	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
*/
	
	
	
}
