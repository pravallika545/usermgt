package com.dxctraining.usermgt.dto;


public class UserDto {

	private int userId;
	private String userType;
	private String userName;
	private long userPhone;
	private String password;

	public UserDto() {

	}

	public UserDto(int userId, String userType, String userName, long userPhone, String password) {
		this.userId = userId;
		this.userType = userType;
		this.userName = userName;
		this.userPhone = userPhone;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
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

}