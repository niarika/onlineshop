package com.sprint1.onlineshop.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sprint1.onlineshop.user.entity.LoginDetails;
import com.sprint1.onlineshop.user.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userservice;

	@GetMapping("/user")
	public List<LoginDetails> getAllUser() {
		return userservice.getAllUser();
	}

	@PostMapping("/user/add")
	public String addUser(@RequestBody LoginDetails user) {
		userservice.addUser(user);
		return "user added";
	}

	@DeleteMapping("/user/delete/{userId}")
	public String deleteUser(@PathVariable(required = true) Integer userId) {
		userservice.deleteUser(userId);
		return "user deleted";
	}

	@GetMapping("/user/get/{userId}")
	public LoginDetails getUserById(@PathVariable(required = true) Integer userId) {
		return userservice.getUserById(userId);
	}

	@PostMapping("/user/update/{userId}")
	public String updateUser(@RequestBody LoginDetails user) {
		userservice.updateUser(user);
		return "user updated";
	}

	@GetMapping("/user/check/{userId}")
	public String checkIfUserExists(@PathVariable(required = true) Integer userId) {
		userservice.checkIfUserExists(userId);
		return "user exists";
	}

	@PostMapping("/addreguser")
	public LoginDetails addreguser(@RequestBody LoginDetails user) {
		return userservice.addreguser(user);
	}

}