package org.comit.course.bean;
public class Login {
	
	String username;
	String password;
		
	
	
	//constructor
	Login(){
		
		username="";
		password="";
	}
	public Login(String username, String password, int timesOfAttend, boolean flag) {
		super();
		this.username = username;
		this.password = password;

	}
	

}
