package com.atcs.springmapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atcs.springmapping.entity.Admission;

@Repository
public interface AdmissionRepo extends JpaRepository<Admission, Integer> {

}
