package com.atcs.springlayerspro.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.atcs.springlayerspro.entity.Branch;
import com.atcs.springlayerspro.entity.Student;
import com.atcs.springlayerspro.model.StudentModel;
import com.atcs.springlayerspro.repo.BranchRepo;
import com.atcs.springlayerspro.repo.StudentRepo;
import com.atcs.springlayerspro.services.StudentServices;

@Component
public class StudentServicesImpl implements StudentServices {

	@Autowired
	StudentRepo studentRepo;
	
	@Autowired
	BranchRepo branchRepo;
	
	

	@Override
	public List<Student> getData() {
		
		return studentRepo.findAll();
	}

	@Override
	public List<Student> putData(Student stu) {
	
		studentRepo.save(stu);
		return studentRepo.findAll();
	}

	@Override
	public List<Student> deleteData(int id) {
		
		studentRepo.deleteById(id);
		return studentRepo.findAll();
	}

	@Override
	public Optional<Student> getDataById(int id) {
		
		Optional<Student> st = studentRepo.findById(id);
		return st;
	}

	@Override
	public void postData(StudentModel stu) {
		
		Student st = new Student();
		st.setId(stu.getId());
		st.setName(stu.getName());
		st.setRollno(stu.getRollno());
		
		Branch ob = branchRepo.findById(stu.getBranch()).get();
		st.setB_id(ob);
		
		studentRepo.save(st);
		
		
	}



}
