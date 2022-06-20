package com.atcs.loginassignment.services;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Service;

import com.atcs.loginassignment.entity.User;

@Service
public interface UserService {

	
	public List<User> getData();
	
	public void postData(User user);
	
	public User getDataById(BigInteger id);
	
	public List<User> putData(User user);
	
	public List<User> deleteById(BigInteger id);
}
