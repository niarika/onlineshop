package com.sprint1.onlineshop.user.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sprint1.onlineshop.user.entity.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Integer> {

	@Query(value = "SELECT * FROM profile WHERE name = ?1", nativeQuery = true)
	List<Profile> findByName(String prname);

}