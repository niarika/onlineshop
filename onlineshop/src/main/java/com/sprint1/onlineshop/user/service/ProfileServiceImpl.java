package com.sprint1.onlineshop.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprint1.onlineshop.user.dao.ProfileRepository;
import com.sprint1.onlineshop.user.entity.Profile;
import com.sprint1.onlineshop.user.exception.ProfileNotFoundException;

@Service
@Transactional
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileRepository repository;

	@Override
	public List<Profile> getProfiles() {
		return (List<Profile>) repository.findAll();
	}

	@Override
	public List<Profile> findByName(String userName) {
		Optional<List<Profile>> profile = Optional.ofNullable(repository.findByName(userName));
		if (profile.isPresent()) {
			return profile.get();
		} else {
			throw new ProfileNotFoundException(UserServiceConstants.PROFILE_NOT_FOUND_WITH_NAME + userName);
		}
	}

	@Override
	public void save(Profile profile) {
		repository.save(profile);
	}

	@Override
	public void updateProfile(Profile profile) {
		Optional<Profile> pr = repository.findById(profile.getUserId());

		if (pr.isPresent()) {
			repository.save(profile);
		} else {
			throw new ProfileNotFoundException(UserServiceConstants.PROFILE_NOT_FOUND_WITH_ID);
		}

	}
}