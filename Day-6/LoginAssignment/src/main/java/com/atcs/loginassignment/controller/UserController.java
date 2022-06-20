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

import com.atcs.loginassignment.entity.User;
import com.atcs.loginassignment.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired(required=true)
	UserService userService;
	
	@GetMapping("/")
	public List<User> getdata()
	{
		return userService.getData();
		
	}
	
	@PostMapping("/")
	public void postdata(@RequestBody User user)
	{
		userService.postData(user);
	}
	
	@PutMapping("/")
	public List<User> updateData(@RequestBody User user)
	{
		return userService.putData(user);
		
	}
	
	@DeleteMapping("/{id}")
	public List<User> deleteData(@PathVariable("id") BigInteger id)
	{
		return userService.deleteById(id);
		
	}
	
}
