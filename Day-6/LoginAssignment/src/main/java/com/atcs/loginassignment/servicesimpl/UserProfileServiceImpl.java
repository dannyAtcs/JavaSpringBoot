package com.atcs.loginassignment.servicesimpl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.atcs.loginassignment.entity.UserProfile;
import com.atcs.loginassignment.exception.ApiRequestException;
import com.atcs.loginassignment.repo.UserProfileRepo;
import com.atcs.loginassignment.services.UserProfileService;
import com.atcs.loginassignment.validation.EnumChecker;


@Component
public class UserProfileServiceImpl implements UserProfileService{

	@Autowired
	UserProfileRepo userProfileRepo;
	
	@Override
	public List<UserProfile> getData() {
		
		return userProfileRepo.findAll();
	}

	@Override
	public void postData(UserProfile userProfile) {
		
		System.out.println("Heelo");
	if(EnumChecker.findByName(userProfile.getCountry().name())==null) throw new ApiRequestException("Country is not Present In Enum");
			
		userProfileRepo.save(userProfile);
		
	}

	@Override
	public UserProfile getDataById(BigInteger id) {
		
		
		return userProfileRepo.findById(id).get();
	}

	@Override
	public List<UserProfile> putData(UserProfile userProfile) {
		
		userProfileRepo.save(userProfile);
		return userProfileRepo.findAll();
	}

	@Override
	public List<UserProfile> deleteById(BigInteger id) {
		
		userProfileRepo.deleteById(id);
		return userProfileRepo.findAll();
	}

	
}
