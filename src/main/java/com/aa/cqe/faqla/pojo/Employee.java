package com.aa.cqe.faqla.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {
	@JsonProperty("employeeID")
	private String employeeID;
	
	@JsonProperty("airlineCode")
	private String airlineCode;
	
	@JsonProperty("requests")
	List<Request> requests;

	@JsonProperty("employeeID")
	public String getEmployeeID() {
		return employeeID;
	}

	@JsonProperty("employeeID")
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	@JsonProperty("airlineCode")
	public String getAirlineCode() {
		return airlineCode;
	}

	@JsonProperty("airlineCode")
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	@JsonProperty("requests")
	public List<Request> getRequests() {
		return requests;
	}

	@JsonProperty("requests")
	public void setRequests(List<Request> requests) {
		this.requests = requests;
	}
	
	
	
}
