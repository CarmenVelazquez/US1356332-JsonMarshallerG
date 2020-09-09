package com.aa.cqe.faqla.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeResponse {
	@JsonProperty("employeeID")
	private String employeeID;
	
	@JsonProperty("airlineCode")
	private String airlineCode;
	
	@JsonProperty("qlaResponses")
	private List<QLAResponses> qlaResponses;
	
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
	
	@JsonProperty("qlaResponses")
	public List<QLAResponses> getQlaResponses() {
		return qlaResponses;
	}
	
	@JsonProperty("qlaResponses")
	public void setQlaResponses(List<QLAResponses> qlaResponses) {
		this.qlaResponses = qlaResponses;
	}
	
	
	
}
