package com.atcs.springmapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atcs.springmapping.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
