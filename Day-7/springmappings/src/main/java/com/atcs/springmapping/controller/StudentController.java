package com.atcs.springmapping.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atcs.springmapping.entity.Student;
import com.atcs.springmapping.repo.StudentRepo;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentRepo studentRepo;
	
	@GetMapping("/")
	public List<Student> getData()
	{
		return studentRepo.findAll();
		
	}
	
	@PostMapping("/")
	public void postData(@RequestBody Student student)
	{
		studentRepo.save(student);
	}
	
	@PutMapping("/")
	public void update(@RequestBody Student student)
	{
		studentRepo.save(student);
	}
}
