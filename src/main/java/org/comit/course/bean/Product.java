package org.comit.course.bean;
public class Product {

	int productId;
	String productName;
	int qty_stock;
	int qty_sold;
	float price;
	
//constructors
	
	public Product() {
		super();
		productId = 0;
		productName = "";
		int qty_stock=0;
		int qty_sold=0;
		price = 0;
	}
	

	public Product(int productId, String productName, int qty_stock, int qty_sold, float price) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.qty_stock = qty_stock;
	this.qty_sold = qty_sold;
	this.price = price;
}

	//getter and setter
	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getQty_stock() {
		return qty_stock;
	}


	public void setQty_stock(int qty_stock) {
		this.qty_stock = qty_stock;
	}


	public int getQty_sold() {
		return qty_sold;
	}


	public void setQty_sold(int qty_sold) {
		this.qty_sold = qty_sold;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", qty_stock=" + qty_stock
				+ ", qty_sold=" + qty_sold + ", price=" + price + "]";
	}


	
	
	
	
	
}
