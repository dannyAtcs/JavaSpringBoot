package com.atcs.loginassignment.repo;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atcs.loginassignment.entity.UserProfile;

public interface UserProfileRepo extends JpaRepository<UserProfile, BigInteger>{

}
