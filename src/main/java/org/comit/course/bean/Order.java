package org.comit.course.bean;

import java.util.ArrayList;
import java.util.List;

public class Order {

	int orderId;
	int customerId;
	List<Product> products = new ArrayList<>();

	public Order(int orderId, int customerId, String status, List<Product> products) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.products = products;
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

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
