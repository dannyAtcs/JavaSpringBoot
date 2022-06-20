package com.atcs.springlayerspro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atcs.springlayerspro.entity.Student;
import com.atcs.springlayerspro.model.StudentModel;
import com.atcs.springlayerspro.services.StudentServices;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentServices studentServices;
	
	@GetMapping("/")
	public List<Student> getAllData()
	{
		return studentServices.getData();
	}
	
	@GetMapping("/{id}")
	public Optional<Student> getDatabyId(@PathVariable int id)
	{
		return studentServices.getDataById(id);
		
	}
	@PostMapping("/")
	public void post(@RequestBody StudentModel stu)
	{
		 studentServices.postData(stu);
	}
	
	@PutMapping("/")
	public List<Student> put(@RequestBody Student stu)
	{
		
		return studentServices.putData(stu);
	}
	
	@DeleteMapping("/{id}")
	public List<Student> delete(@PathVariable("id") int id)
	{
		return studentServices.deleteData(id);
	}
}
