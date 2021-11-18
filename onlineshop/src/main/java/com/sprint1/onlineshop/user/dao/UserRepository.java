package com.sprint1.onlineshop.user.dao;

import org.springframework.data.repository.CrudRepository;

import com.sprint1.onlineshop.user.entity.LoginDetails;

public interface UserRepository extends CrudRepository<LoginDetails, Integer> {

}
