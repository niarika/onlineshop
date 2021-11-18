package com.sprint1.onlineshop.userdao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sprint1.onlineshop.userentity.UserDetails;

public interface UserRepository extends CrudRepository<UserDetails, Integer> {

	//@Query( value = "SELECT * FROM user WHERE name = ?1", nativeQuery = true)
	//Optional<UserDetails> findByName(String login,String userPassword);

	
	//
	//Optional<UserDetails>findByLoginAnduserPassword(String login,String userpassword);
}
