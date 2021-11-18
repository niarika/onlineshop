package com.sprint1.onlineshop.userservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.sprint1.onlineshop.userdao.ProfileRepository;
import com.sprint1.onlineshop.userentity.Profile;
import com.sprint1.onlineshop.userexception.ProfileNotFoundException;



@Service
@Transactional
public class ProfileServiceImpl implements ProfileService{

@Autowired
private ProfileRepository repository;



@Override
public List<Profile> getProfiles() {
return (List<Profile>) repository.findAll();
}



@Override
public List<Profile> findByName(String prname) {
Optional<List<Profile>> profile=Optional.ofNullable(repository.findByName(prname));
if(profile.isPresent()) {
return profile.get();
}
else {
throw new ProfileNotFoundException("profile not found with name :" +prname);
}
}



@Override
public void save(Profile profile) {
repository.save(profile);
}



@Override
public Profile updateProfile(Profile profile) {
Optional<Profile> pr=repository.findById(profile.getPrid());

if(pr.isPresent()) {
Profile p=pr.get();
p.setPrid(profile.getPrid());
p.setPraddress(profile.getPraddress());
p.setPremail(profile.getPremail());
p.setPrname(profile.getPrname());
p.setPrpassword(profile.getPrpassword());
p.setPrphno(profile.getPrphno());
return p;
}
else {
throw new ProfileNotFoundException("profile not found with name");
}
}
}