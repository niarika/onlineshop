package com.sprint1.onlineshop.userdao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sprint1.onlineshop.userentity.Profile;


public interface ProfileRepository extends CrudRepository<Profile, Long> {



@Query(value = "SELECT * FROM profile WHERE name = ?1", nativeQuery = true)
List<Profile> findByName(String prname);

//@Query(value = "delete FROM books WHERE name = ?1", nativeQuery = true)
//void deleteByName(String prname);




}