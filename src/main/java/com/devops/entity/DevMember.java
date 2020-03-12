package com.devops.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DevMember {
	
	   public DevMember() {
	       
	   }
	   public DevMember(String name, String role) {
	      super();
	      
	      this.name = name;
	      this.role = role;
	   }
	   
	private String name;
	private String role;
	
	@Override
	public String toString() {
		return "DevMember [name=" + name + ", role=" + role + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
