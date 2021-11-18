package com.sprint1.onlineshop.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoginDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	private String userName;
	private String userPassword;
	private Boolean login;

	public LoginDetails() {
		super();
	}

	public LoginDetails(Integer userId, String userName, String userPassword, Boolean login) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.login = login;
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

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Boolean getLogin() {
		return login;
	}

	@Override
	public String toString() {
		return "LoginDetails [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", login=" + login + "]";
	}

}
