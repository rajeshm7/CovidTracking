package com.rajesh.covid.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int aadharId;
	private String name;
	private String location;
	private String isCovidAffected;
	private String isInQuarantine;
	private String noOfQuarantineDaysLeft;
	private String isCovidCured;
	
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
	public String getIsCovidAffected() {
		return isCovidAffected;
	}
	public void setIsCovidAffected(String isCovidAffected) {
		this.isCovidAffected = isCovidAffected;
	}
	public String getIsInQuarantine() {
		return isInQuarantine;
	}
	public void setIsInQuarantine(String isInQuarantine) {
		this.isInQuarantine = isInQuarantine;
	}
	public String getNoOfQuarantineDaysLeft() {
		return noOfQuarantineDaysLeft;
	}
	public void setNoOfQuarantineDaysLeft(String noOfQuarantineDaysLeft) {
		this.noOfQuarantineDaysLeft = noOfQuarantineDaysLeft;
	}
	public String getIsCovidCured() {
		return isCovidCured;
	}
	public void setIsCovidCured(String isCovidCured) {
		this.isCovidCured = isCovidCured;
	}
}
