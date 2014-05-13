package com.jolafa.storytrain.model;

public class User {

	private int id;
	private String username;
	private String email;
	private String password;
	private boolean active;
	
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public boolean isActive() {
		return active;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

}
