package com.sprint1.onlineshop.usercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sprint1.onlineshop.userentity.Profile;
import com.sprint1.onlineshop.userservice.ProfileService;



@RestController
public class ProfileController {
	@Autowired
	private ProfileService profileService;
	
	@GetMapping("/getprofiles")
	public List<Profile> getProfiles()
	{
	System.out.println(profileService.getProfiles());
	return profileService.getProfiles();
	}

	@PostMapping("/saveprofile")
	public ResponseEntity<?> save(@RequestBody Profile profile)
	{
	profileService.save(profile);
	return ResponseEntity.ok(profile+" saved");
	}

	@GetMapping("/get/{prname}")
	public List<Profile> findByName(@PathVariable(required = true) String prname){
	return profileService.findByName(prname);
	}

	@PostMapping("/update")
	public void updateProfile(@RequestBody Profile profile) {
	profileService.updateProfile(profile);
	}
	
}