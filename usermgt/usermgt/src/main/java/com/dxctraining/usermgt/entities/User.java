package com.dxctraining.usermgt.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class User {

	@Id
	@GeneratedValue
	private Integer userId;
	private String userType;
	private String userName;
	private long userPhone;
	private String password;
	
	public User() {
	}
	public User(String userType, String userName, long userPhone, String password) {
		this.userType = userType;
		this.userName = userName;
	    this.userPhone = userPhone;
		this.password = password;
	}
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

	public long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object arg) {
		if (this == arg) {
			return true;
		}

		if (arg == null || !(arg instanceof User)) {
			return false;
		}

		User that = (User) arg;
		boolean isequal = this.userId == that.userId;
		return isequal;
	}

	@Override
	public int hashCode() {
		return userId;
	}

}
		
	
