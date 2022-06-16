package com.atcs.spring;

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


@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentRepo studentRepo;
	
	@GetMapping("/")
	public List<StudentEntity> getData()
	{
		return studentRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<StudentEntity> getDataById(@PathVariable("id") int id)
	{
		return studentRepo.findById(id);
		
	}
	
	@PostMapping("/")
	public List<StudentEntity> postData(@RequestBody StudentEntity stu)
	{
		studentRepo.save(stu);
		return studentRepo.findAll();
	}
	
	@PutMapping("/")
	public List<StudentEntity> putData(@RequestBody StudentEntity stu)
	{
		studentRepo.save(stu);
		return studentRepo.findAll();
	}
	
	@DeleteMapping("/{id}")
	public List<StudentEntity> deleteDataById(@PathVariable("id") int id)
	{
		studentRepo.deleteById(id);
		return studentRepo.findAll();
		
	}
}
