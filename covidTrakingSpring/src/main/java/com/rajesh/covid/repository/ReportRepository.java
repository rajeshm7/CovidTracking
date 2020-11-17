package com.rajesh.covid.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.rajesh.covid.model.Employee;
import com.rajesh.covid.model.EmployeeReport;

public interface ReportRepository  extends JpaRepository<EmployeeReport, Integer>{

	public Optional<EmployeeReport> findByAadharId(int id);

}
