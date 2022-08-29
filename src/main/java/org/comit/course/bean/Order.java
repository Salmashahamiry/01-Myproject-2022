package org.comit.course.bean;
public class Order {
	
	int orderId;
	int productId;
	int qty;
	int unitPrice;
	int totalPrice;
	String dateOfOrder;
		
	
	Order(){
		
		 orderId=0;		
		 
		 productId=0;		
		 qty=0;
		 unitPrice=0;
		 totalPrice=0;
		 dateOfOrder="";
		
	}
	
	public Order(int orderId, int productId, int qty, int unitPrice, int totalPrice, String dateOfOrder) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.qty = qty;
		this.unitPrice = unitPrice;
		this.totalPrice = totalPrice;
		this.dateOfOrder = dateOfOrder;
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
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(String dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	
	
	
}
