package com.atcs.springmapping.controller;

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

import com.atcs.springmapping.entity.Address;
import com.atcs.springmapping.repo.AddressRepo;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	AddressRepo addressRepo;
	
	@GetMapping("/")
	public List<Address> getData()
	{
		return addressRepo.findAll();
		
	}
	
	@PostMapping("/")
	public void getPost(@RequestBody Address address)
	{
		addressRepo.save(address);
	}
	
	@PutMapping("/")
	public void update(@RequestBody Address address)
	{
		addressRepo.save(address);
	}
	
	@DeleteMapping("/{id}")
	public List<Address> deleteId(@PathVariable("id") int id )
	{
		addressRepo.deleteById(id);
		return addressRepo.findAll();
		
	}

}
