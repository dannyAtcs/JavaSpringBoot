package com.atcs.springmapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.atcs.springmapping.entity.Teacher;
import com.atcs.springmapping.repo.TeacherRepo;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	TeacherRepo teacherRepo;
	
	@GetMapping("/")
	public List<Teacher> getData()
	{
		return teacherRepo.findAll();
		
	}
	
	@PostMapping("/")
	public void getPost(@RequestBody Teacher teacher)
	{
		teacherRepo.save(teacher);
	}
	
	@PutMapping("/")
	public void update(@RequestBody Teacher teacher)
	{
		teacherRepo.save(teacher);
	}
}
