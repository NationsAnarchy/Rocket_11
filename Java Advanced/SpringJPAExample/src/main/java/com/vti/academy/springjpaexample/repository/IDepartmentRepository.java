package com.vti.academy.springjpaexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.academy.springjpaexample.entity.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Short> {

	public Department findByName(String name);

	public boolean existsByName(String name);
}
