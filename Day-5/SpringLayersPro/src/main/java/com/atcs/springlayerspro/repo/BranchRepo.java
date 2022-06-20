package com.atcs.springlayerspro.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import com.atcs.springlayerspro.entity.Branch;

@RestController
public interface BranchRepo extends JpaRepository<Branch, Integer>{

	
}
