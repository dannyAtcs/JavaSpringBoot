package com.atcs.loginassignment.servicesimpl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atcs.loginassignment.entity.User;
import com.atcs.loginassignment.exception.ApiRequestException;
import com.atcs.loginassignment.repo.UserRepo;
import com.atcs.loginassignment.services.UserService;
import com.atcs.loginassignment.validation.ValidPassword;

@Component
public class UserServiceImpl implements UserService  {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public List<User> getData() {
		
		return userRepo.findAll();
	}

	@Override
	public void postData(User user) {
		
		
		if(ValidPassword.isValidPassword(user.getPassword())==false) throw new ApiRequestException("password must contain atleast 1 uppercase, 1 lowercase, 1 special character and 1 digit ");
		
		
		userRepo.save(user);
	}

	@Override
	public User getDataById(BigInteger id) {
		
		return userRepo.findById(id).get();
	}

	@Override
	public List<User> putData(User user) {
		
		userRepo.save(user);
		return userRepo.findAll();
	}


	@Override
	public List<User> deleteById(BigInteger id) {
		
		userRepo.deleteById(id);
		return userRepo.findAll();
	}

}
