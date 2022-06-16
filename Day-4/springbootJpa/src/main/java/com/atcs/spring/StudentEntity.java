package com.atcs.spring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="std")
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	int id;
	
	@Column
	String name;
	
	@Column
	int rollno;
	
	@Column
	String branch;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public StudentEntity(int id, String name, int rollno, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.branch = branch;
	}

	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
