package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RoleEntity {
  
	@Id
	private String role;
	private String roledescription;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRoledescription() {
		return roledescription;
	}
	public void setRoledescription(String roledescription) {
		this.roledescription = roledescription;
	}
	@Override
	public String toString() {
		return "RoleEntity [role=" + role + ", roledescription=" + roledescription + "]";
	}
	
}
