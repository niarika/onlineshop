package com.sprint1.onlineshop.usercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sprint1.onlineshop.userentity.UserDetails;
import com.sprint1.onlineshop.userservice.UserService;



@RestController
public class UserController {
	@Autowired
	UserService userservice;

	@GetMapping("/user")
	public List<UserDetails> getAllUser() {
		System.out.println(userservice.getAllUser());
		return userservice.getAllUser();
	}

	@PostMapping("/user/add")
	public void addUser(@RequestBody UserDetails user) {
		userservice.addUser(user);
	}

	@DeleteMapping("/user/delete/{userId}")
	public void deleteUser(@PathVariable(required = true) int userId) {
		userservice.deleteUser(userId);
	}

	@GetMapping("/user/get/{userId}")
	public UserDetails getUserById(@PathVariable(required = true) int userId) {
		return userservice.getUserById(userId);
	}

	@PostMapping("/user/update/{userId}")
	public void updateUser(@RequestBody UserDetails user) {
		userservice.updateUser(user);
	}
	
	/**@GetMapping("/register")
	public String getRegisterPage(@RequestBody UserDetails user ) {
		return "Welcome Online Shopping";
		
	}
	@GetMapping("/user/register/{login}/{userPassword}")
	public UserDetails registerUser(@PathVariable(required = true) String login,@PathVariable(required = true) String userPassword) {
		return userservice.getUserByName(login,userPassword);
		
	}*/
	@PostMapping("/addreguser")
	public UserDetails addreguser(@RequestBody UserDetails user) {
		return userservice.addreguser(user);
	}
	

}