package com.aa.cqe.faqla.pojo.perrule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"trackingID",
"timeStamp",
"optimizeRules",
"employeeResponses"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class FAQLAPerRuleResponse {

	@JsonProperty("trackingID")
	private String trackingID;
	
	public String getTrackingID() {
		return trackingID;
	}
	public void setTrackingID(String trackingID) {
		this.trackingID = trackingID;
	}

	@JsonProperty("timeStamp")
	private String timeStamp;
	@JsonProperty("timeStamp")
	public String getTimeStamp() {
		return timeStamp;
	}
	@JsonProperty("timeStamp")
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@JsonProperty("optimizeRules")
	private boolean optimizeRules;
	
	@JsonProperty("optimizeRules")
	public boolean getOptimizeRules() {
		return optimizeRules;
	}

	@JsonProperty("optimizeRules")
	public void setOptimizeRules(boolean optimizeRules) {
		this.optimizeRules = optimizeRules;
	}
	
	@JsonProperty("employeeResponses")
	private EmployeeResponses employeeResponses;
	
	@JsonProperty("employeeResponses")
	public EmployeeResponses getEmployeeResponses() {
		return employeeResponses;
	}

	@JsonProperty("employeeResponses")
	public void setEmployeeResponses(EmployeeResponses employeeResponses) {
		this.employeeResponses = employeeResponses;
	}

}
