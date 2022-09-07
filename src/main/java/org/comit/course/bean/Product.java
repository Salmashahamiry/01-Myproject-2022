package org.comit.course.bean;

public class Product {

	int productId;
	String productName;
	int qty;
	float price;

//constructors

	public Product(int productId, String productName, int qty, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.qty = qty;
		this.price = price;
	}
	// getter and setter

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

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
