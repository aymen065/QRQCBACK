package com.misfat.qrqc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class AppRole {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String roleName;
	
	public AppRole() {
		super();
	}
	public AppRole(Integer id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
	}
	public long getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}

