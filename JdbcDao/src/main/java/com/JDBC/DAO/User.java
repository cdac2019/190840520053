package com.JDBC.DAO;

public class User {

	private int rno;
	private String name;
	private String email;
	private String mobile;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "User [rno=" + rno + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}
	 
}
