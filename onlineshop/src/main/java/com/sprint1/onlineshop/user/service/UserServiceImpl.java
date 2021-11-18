package com.sprint1.onlineshop.user.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint1.onlineshop.user.dao.UserRepository;
import com.sprint1.onlineshop.user.entity.LoginDetails;
import com.sprint1.onlineshop.user.exception.UserNotFoundException;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userepository;

	@Override
	public void addUser(LoginDetails user) {
		userepository.save(user);

	}

	@Override
	public void updateUser(LoginDetails user) {
		Optional<LoginDetails> userDb = this.userepository.findById(user.getUserId());

		if (userDb.isPresent()) {
			userepository.save(user);
		} else {
			throw new UserNotFoundException(UserServiceConstants.USER_NOT_FOUND_WITH_ID + user.getUserId());
		}
	}

	@Override
	public List<LoginDetails> getAllUser() {
		return (List<LoginDetails>) this.userepository.findAll();
	}

	@Override
	public LoginDetails getUserById(Integer userId) {

		Optional<LoginDetails> userDb = this.userepository.findById(userId);
		if (userDb.isPresent()) {
			return userDb.get();
		} else {
			throw new UserNotFoundException(UserServiceConstants.USER_NOT_FOUND_WITH_ID + userId);
		}
	}

	@Override
	public void deleteUser(Integer userId) {
		Optional<LoginDetails> userDb = this.userepository.findById(userId);
		if (userDb.isPresent()) {
			this.userepository.delete(userDb.get());
		} else {
			throw new UserNotFoundException(UserServiceConstants.USER_NOT_FOUND_WITH_ID + userId);
		}
	}

	@Override
	public LoginDetails registerUser(Boolean login, String userName, String userpassword) {
		if (login != null && userpassword != null) {
			LoginDetails user = new LoginDetails();
			user.setUserName(userName);
			user.setUserPassword(userpassword);
			return this.userepository.save(user);
		} else {
			return null;
		}

	}

	@Override
	public boolean checkIfUserExists(Integer userId) {
		Optional<LoginDetails> userDb = this.userepository.findById(userId);
		if (userDb.isEmpty()) {
			return false;
		} else
			return true;
	}

	@Override
	public LoginDetails addreguser(LoginDetails user) {
		return userepository.save(user);

	}

}