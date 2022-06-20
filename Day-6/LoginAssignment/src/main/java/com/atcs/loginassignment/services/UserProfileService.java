package com.atcs.loginassignment.services;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Service;
import com.atcs.loginassignment.entity.UserProfile;

@Service
public interface UserProfileService {

	public List<UserProfile> getData();
	
	public void postData(UserProfile userProfile);
	
	public UserProfile getDataById(BigInteger id);
	
	public List<UserProfile> putData(UserProfile userProfile);
	
	public List<UserProfile> deleteById(BigInteger id);
}
