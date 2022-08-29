package org.comit.course.bean;
public class Login {
	
	String username;
	String password;
	int timesOfAttend;
	boolean flag;//block or unblock
	
	
	
	
	//constructor
	Login(){
		
		username="";
		password="";
		timesOfAttend=0;
		flag=true;
	}
	
	public Login(String username, String password, int timesOfAttend, boolean flag) {
		super();
		this.username = username;
		this.password = password;
		this.timesOfAttend = timesOfAttend;
		this.flag = flag;
	}
	

}
