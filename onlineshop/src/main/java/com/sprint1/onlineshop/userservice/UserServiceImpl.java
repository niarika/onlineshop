package com.sprint1.onlineshop.userservice;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprint1.onlineshop.userdao.UserRepository;
import com.sprint1.onlineshop.userentity.UserDetails;
import com.sprint1.onlineshop.userexception.UserNotFoundException;


@Service
@Transactional
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserRepository userepository;
	//@Autowired
	//private ProfileRepository repository;


	@Override
	public UserDetails addUser(UserDetails user) {
		return userepository.save(user);

	}

	@Override
	public UserDetails updateUser(UserDetails user) {
		Optional<UserDetails> userDb = this.userepository.findById(user.getUserId());

		if (userDb.isPresent()) {
			UserDetails userUpdate = userDb.get();
			userUpdate.setUserId(user.getUserId());
			userUpdate.setUserName(user.getUserName());
			userUpdate.setUserPassword(user.getUserPassword());
			return userUpdate;
		} else {
			throw new UserNotFoundException("User not found with id : " + user.getUserId());
		}
	}

	@Override
	public List<UserDetails> getAllUser() {
		return (List<UserDetails>) this.userepository.findAll();
	}

	@Override
	public UserDetails getUserById(int userId) {

		Optional<UserDetails> userDb = this.userepository.findById(userId);
		if (userDb.isPresent()) {
			return userDb.get();
		} else {
			throw new UserNotFoundException("User not found with id : " + userId);
		}
	}
	
	/**@Override
	public UserDetails getUserByName(String login,String userPasssword) {

		Optional<UserDetails> userDb =  this.userepository.findByName(login, userPasssword);
		if (userDb.isPresent()) {
			return userDb.get();
		} else {
			throw new UserNotFoundException("User not found with id : " + login);
		}
	}*/

	@Override
	public void deleteUser(int userId) {
		Optional<UserDetails> userDb = this.userepository.findById(userId);
		if (userDb.isPresent()) {
			this.userepository.delete(userDb.get());
		} else {
			throw new UserNotFoundException("User not found with id : " + userId);
		}
	}
	
	@Override
	public UserDetails registerUser(String login,String userpassword) {
		if(login !=null && userpassword !=null) {
			UserDetails user =new UserDetails();
			user.setLogin(login);
			user.setUserPassword(userpassword);
			return this.userepository.save(user);
		}else {
			return null;
		}
	}
	
	@Override
	public boolean checkLogin(int userId,String userPassword) {
		Optional<UserDetails> userDb = this.userepository.findById(userId);
		if(userDb != null) {
			//String userpass = userDb.getByPassword();
			if(userDb.equals(userPassword)) {
				return true;
			}
			else {
				return false;
			}	
		}
		else return false;
	}

	@Override
	public boolean checkIfUserExists(int userId) {
		Optional<UserDetails> userDb = this.userepository.findById(userId);
		if(userDb != null) {
			return false;
		}
		else return true;
	}

	@Override
	public UserDetails addreguser(UserDetails user) {
		return userepository.save(user);
		
	}

	
	
}