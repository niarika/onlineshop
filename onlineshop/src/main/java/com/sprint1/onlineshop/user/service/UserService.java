package com.sprint1.onlineshop.user.service;

import java.util.List;

import com.sprint1.onlineshop.user.entity.LoginDetails;

public interface UserService {
	public void addUser(LoginDetails user);

	public void updateUser(LoginDetails user);

	public List<LoginDetails> getAllUser();

	public LoginDetails getUserById(Integer userId);

	public void deleteUser(Integer userId);

	public boolean checkIfUserExists(Integer userId);

	public LoginDetails registerUser(Boolean login, String userName, String userpassword);

	public LoginDetails addreguser(LoginDetails user);

}
