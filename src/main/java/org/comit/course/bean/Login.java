package org.comit.course.bean;
public class Login {
	
	String userName;
	String password;
		
	
	
	//constructor
	Login(){
		
		userName="";
		password="";
	}



	public Login(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

	

}
