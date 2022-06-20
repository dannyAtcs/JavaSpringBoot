package com.atcs.loginassignment.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atcs.loginassignment.entity.UserProfile;
import com.atcs.loginassignment.services.UserProfileService;

@RestController
@RequestMapping("/userprofile")
public class UserProfileController {

	@Autowired
	UserProfileService userProfileService;
	
	@GetMapping
	public List<UserProfile> getdetails()
	{
		return userProfileService.getData();
	}
	
	@GetMapping("/{id}")
	public UserProfile getById(@PathVariable("id") BigInteger id)
	{
		return userProfileService.getDataById(id);
		
	}
	
	@PostMapping
	public List<UserProfile> postData(@RequestBody UserProfile userProfile)
	{
		userProfileService.postData(userProfile);
		return userProfileService.getData();
		
	}
	
	@PutMapping("/")
	public List<UserProfile> putData(@RequestBody UserProfile userProfile)
	{
		userProfileService.putData(userProfile);
		return userProfileService.getData();
		
	}
	
	@DeleteMapping("/{id}")
	public List<UserProfile> deleteDetails(@PathVariable("id") BigInteger id)
	{
		return userProfileService.deleteById(id);
		
	}
	
}
