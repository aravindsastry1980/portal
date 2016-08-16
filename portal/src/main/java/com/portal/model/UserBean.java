package com.portal.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserBean {

	@Id
	private String userID;
	private String password;
	
	public UserBean() {
	}
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
