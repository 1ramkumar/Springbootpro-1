package com.klef.jfsd.springbootclg.adminDto;

public class adminDto {
public String username;
public String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public adminDto(String username, String password) {
	super();
	this.username = username;
	this.password = password;
}
public adminDto(){
	
}
}
