package org.comit.course.bean;

public class Customer {
	int customerId;
	int orderId;
	String name;
	String lastname;
	String phone;
	String email;
	String street;
	String city;
	String state;
	String postalcode;

	// constructors

	
	public Customer() {
		super();
		customerId = 0;
		orderId = 0;
		name = "";
		lastname = "";
		phone = "";
		email = "";
		street = "";
		city = "";
		state = "";
		postalcode = "";
	}
	
	
	public Customer(int customerId, int orderId, String name, String lastname, String phone, String email,
			String street, String city, String state, String postalcode) {
		super();
		this.customerId = customerId;
		this.orderId = orderId;
		this.name = name;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalcode = postalcode;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public int getOrder_Id() {
		return orderId;
	}


	public void setOrder_Id(int orderId) {
		this.orderId = orderId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPostalcode() {
		return postalcode;
	}


	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	
}
