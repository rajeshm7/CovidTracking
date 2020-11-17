package com.rajesh.covid.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.rajesh.covid.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	public Optional<Employee> findByName(String name);
	
	public Optional<Employee>  findByAadharId(int id);

}
