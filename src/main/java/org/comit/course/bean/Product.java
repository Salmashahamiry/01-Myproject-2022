package org.comit.course.bean;

public class Product {

	int productId;
	String productName;
	int qty;
	double price;
	String image;

//constructors
	public Product() {
	}

	public Product(int productId, String productName, int qty, float price, String image) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.qty = qty;
		this.price = price;
		this.image = image;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
