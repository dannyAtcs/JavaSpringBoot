package com.atcs.springlayerspro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="branch")
public class Branch {

	@Id
	int b_id;
	
	@Column
	String b_name;
	
	@Column
	String b_hod;

	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Branch(int b_id, String b_name, String b_hod) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.b_hod = b_hod;
	}

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getB_hod() {
		return b_hod;
	}

	public void setB_hod(String b_hod) {
		this.b_hod = b_hod;
	}
	
	
}
