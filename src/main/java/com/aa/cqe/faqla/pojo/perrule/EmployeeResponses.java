package com.aa.cqe.faqla.pojo.perrule;

import com.aa.cqe.ruledistribution.CrewSequenceKey;
import com.aa.cqe.ruledistribution.FlightKey;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeResponses {
	

	@JsonProperty("employeeID")
	private String employeeID;
	
	@JsonProperty("threshold")
	private Long threshold;
	
	public Long getThreshold() {
		return threshold;
	}

	public void setThreshold(Long threshold) {
		this.threshold = threshold;
	}

	@JsonProperty("airlineCode")
	private String airlineCode;
	
	@JsonProperty("fltKey")
	private FlightKey fltKey;
	
	@JsonProperty("sequenceKey")
	private CrewSequenceKey sequenceKey;
	
	public FlightKey getFltKey() {
		return fltKey;
	}

	public void setFltKey(FlightKey fltKey) {
		this.fltKey = fltKey;
	}

	public CrewSequenceKey getSequenceKey() {
		return sequenceKey;
	}

	public void setSequenceKey(CrewSequenceKey sequenceKey) {
		this.sequenceKey = sequenceKey;
	}

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
	private QLAResponses qlaResponses;

	public QLAResponses getQlaResponses() {
		return qlaResponses;
	}

	public void setQlaResponses(QLAResponses qlaResponses) {
		this.qlaResponses = qlaResponses;
	}
	


}
