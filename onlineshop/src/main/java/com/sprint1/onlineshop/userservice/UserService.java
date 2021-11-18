package com.sprint1.onlineshop.userservice;

import java.util.List;

import com.sprint1.onlineshop.userentity.UserDetails;



public interface UserService {
	UserDetails addUser(UserDetails user);

	UserDetails updateUser(UserDetails user);

	List<UserDetails> getAllUser();

	UserDetails getUserById(int userId);
	
	//UserDetails getUserByName(String login,String userPassword);

	void deleteUser(int userId);
	
	//User showRegistrationForm(User user);
	
	boolean checkLogin(int userId, String userPassword);

	boolean checkIfUserExists(int userId);

	UserDetails registerUser(String login, String userpassword);

    UserDetails addreguser(UserDetails user);

}
