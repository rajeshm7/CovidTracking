package com.rajesh.covid.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeReport {
	
	@Id
	private int aadharId;
	private String name;
	private String location;
	private String empId;
	private String temperature;
	private String isHavingSymptoms;
	
	public int getAadharId() {
		return aadharId;
	}

	public void setAadharId(int aadharId) {
		this.aadharId = aadharId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getIsHavingSymptoms() {
		return isHavingSymptoms;
	}

	public void setIsHavingSymptoms(String isHavingSymptoms) {
		this.isHavingSymptoms = isHavingSymptoms;
	}

}
