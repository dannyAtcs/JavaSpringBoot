package com.atcs.springlayerspro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.atcs.springlayerspro.entity.Student;
import com.atcs.springlayerspro.model.StudentModel;

@Service
public interface StudentServices {

	public void postData( StudentModel stu);
	
	public Optional<Student> getDataById(int id);
	
	public List<Student> getData();
	
	public List<Student> putData( Student stu);
	
	public List<Student> deleteData( int id);
	
}
