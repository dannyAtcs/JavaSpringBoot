package com.atcs.loginassignment.repo;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atcs.loginassignment.entity.User;

public interface UserRepo extends JpaRepository<User, BigInteger> {

}
