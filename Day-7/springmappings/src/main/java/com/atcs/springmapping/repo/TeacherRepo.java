package com.atcs.springmapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atcs.springmapping.entity.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Integer> {

}
