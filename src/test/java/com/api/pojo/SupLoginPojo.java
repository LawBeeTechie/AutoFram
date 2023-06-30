package com.api.pojo;

public class SupLoginPojo {
	private String username;
	private String password;
	public SupLoginPojo(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
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
	@Override
	public String toString() {
		return "SupLoginPojo [username=" + username + ", password=" + password + "]";
	}
	
}
