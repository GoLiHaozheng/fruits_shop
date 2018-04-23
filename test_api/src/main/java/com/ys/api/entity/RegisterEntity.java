package com.ys.api.entity;

public class RegisterEntity {
	private String telephoneNo;
	private String name;
	private String password;
	private String address;
	public String getTelephoneNo() {
		return telephoneNo;
	}
	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "RegisterEntity [电话号码:"+telephoneNo+",姓名："+name+",密码："+password+",地址:"+address+"]";
	}
	
}
