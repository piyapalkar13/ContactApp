package com.infosys.domain;



public class User {
private Integer uid;	
private String name;
private String phone;

private String email;	
private String address;	
private String loginName;
private String password;
private Integer role;
private Integer loginstatus;
public Integer getUid() {
	return uid;
}
public void setUid(Integer uid) {
	this.uid = uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getLoginName() {
	return loginName;
}
public void setLoginName(String loginName) {
	this.loginName = loginName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Integer getRole() {
	return role;
}
public void setRole(Integer role) {
	this.role = role;
}
public Integer getLoginstatus() {
	return loginstatus;
}
public void setLoginstatus(Integer loginstatus) {
	this.loginstatus = loginstatus;
}



}
