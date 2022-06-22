package com.atcs.springmapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.atcs.springmapping.entity.Admission;
import com.atcs.springmapping.repo.AdmissionRepo;

@RestController
@RequestMapping("/admission")
public class AdmissionController {

	@Autowired
	AdmissionRepo admissionRepo;
	
	@GetMapping("/")
	public List<Admission> getData()
	{
		return admissionRepo.findAll();
		
	}
	
	@PostMapping("/")
	public void getPost(@RequestBody Admission admission)
	{
		admissionRepo.save(admission);
	}
	
	@PutMapping("/")
	public void update(@RequestBody Admission admission)
	{
		admissionRepo.save(admission);
	}
}
