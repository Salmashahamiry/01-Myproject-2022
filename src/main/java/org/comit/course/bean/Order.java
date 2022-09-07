package org.comit.course.bean;
public class Order {
	
	int orderId;
	int productId;
	int customerId;
	String status;//sent or not sent		
	public Order(int orderId, int productId, int customerId, String status) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.customerId = customerId;
		this.status = status;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	




}
