package com.rajesh.covid.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajesh.covid.model.Employee;
import com.rajesh.covid.model.EmployeeReport;
import com.rajesh.covid.repository.EmployeeRepository;
import com.rajesh.covid.repository.ReportRepository;

/**
 * 
 * @author Rajesh
 *
 */
@Service
public class CovidService {
	
	@Autowired
	public EmployeeRepository employeeRepository;
	
	@Autowired
	public ReportRepository reportRepository;
	
	public Optional<Employee> getCovidDetails(int id) {
		return employeeRepository.findByAadharId(id);
	}

	public EmployeeReport reportEmployee(EmployeeReport employeeReport) {
		return reportRepository.save(employeeReport);
	}

	public Iterable<Employee> employeeReport() {
		return employeeRepository.findAll();
	}

	public Employee addCovidDetails(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> getAllDetails() {
		return employeeRepository.findAll();
	}

	public Optional<EmployeeReport> getUserReport(int id) {
		return reportRepository.findByAadharId(id);
	}

}
