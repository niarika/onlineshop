package com.sprint1.onlineshop.user.service;

import java.util.List;

import com.sprint1.onlineshop.user.entity.Profile;

public interface ProfileService {
	public List<Profile> getProfiles();

	public List<Profile> findByName(String prname);

	public void save(Profile profile);

	public void updateProfile(Profile profile);

}