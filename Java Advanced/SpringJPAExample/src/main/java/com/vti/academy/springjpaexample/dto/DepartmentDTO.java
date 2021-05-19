package com.vti.academy.springjpaexample.dto;

import com.vti.academy.springjpaexample.entity.Department;

public class DepartmentDTO {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DepartmentDTO() {
	}

	public Department toEntity() {
		return new Department(name);
	}

}
