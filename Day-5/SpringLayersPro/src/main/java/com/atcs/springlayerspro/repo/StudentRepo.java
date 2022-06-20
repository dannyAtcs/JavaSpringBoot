package com.atcs.springlayerspro.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atcs.springlayerspro.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
