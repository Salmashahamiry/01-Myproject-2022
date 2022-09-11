package org.comit.course.bean;
public class Login {
	
	String userName;
	String password;
		
	
	
	//constructor
	Login(){
		
		userName="";
		password="";
	}
	public Login(String username, String password, int timesOfAttend, boolean flag) {
		super();
		this.userName = userName;
		this.password = password;

	}
	

}
