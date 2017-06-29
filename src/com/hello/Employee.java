package com.hello;

import java.io.Serializable;

public class Employee implements Serializable{
	public Employee()
	{}
private String user;
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
private String pwd;
}
