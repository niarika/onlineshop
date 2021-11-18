package com.sprint1.onlineshop.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Profile {
	@Id
	@GeneratedValue
	private Integer userId;
	private String userName;
	private String email;
	private String userPassword;
	private Long phoneNo;
	private String address;

	public Profile() {
		super();
	}

	public Profile(Integer userId, String userName, String email, String userPassword, Long phoneNo, String address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.userPassword = userPassword;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Profile [userId=" + userId + ", userName=" + userName + ", email=" + email + ", userPassword="
				+ userPassword + ", phoneNo=" + phoneNo + ", address=" + address + "]";
	}

}