package com.sprint1.onlineshop.userservice;

import java.util.List;

import com.sprint1.onlineshop.userentity.Profile;



public interface ProfileService {
public List<Profile> getProfiles();

public List<Profile> findByName(String prname);

public void save(Profile profile);

public Profile updateProfile(Profile profile);



}