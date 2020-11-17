package com.rajesh.covid.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajesh.covid.model.Employee;
import com.rajesh.covid.model.EmployeeReport;
import com.rajesh.covid.service.CovidService;

/**
 * 
 * @author Rajesh
 *
 */

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class CovidController {
	
	@Autowired
	public CovidService covidService;
	
	@GetMapping("/covidDetails/{id}")
	public Optional<Employee> getCovidDetails(@PathVariable int id) {
		return covidService.getCovidDetails(id);
	}

	@GetMapping("/getAllDetails")
	public List<Employee> getAllDetails() {
		return covidService.getAllDetails();
	}
	
	@PostMapping("/addCovidDetails")
	public Employee getCovidDetails(@RequestBody Employee employee) {
		return covidService.addCovidDetails(employee);
	}
	
	@PostMapping("/reportUser")
	public EmployeeReport reportUser(@RequestBody EmployeeReport employeeReport) {
		return covidService.reportEmployee(employeeReport);
	}
	
	@PostMapping("/userReport")
	public Iterable<Employee> getDailyReport() {
		return covidService.employeeReport();
	}
	
	@GetMapping("/userReport/{id}")
	public Optional<EmployeeReport> getUserReport(@PathVariable int id) {
		return covidService.getUserReport(id);
	}
	
}
