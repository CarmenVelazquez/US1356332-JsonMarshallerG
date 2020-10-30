package com.aa.cqe.faqla.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"timeStamp",
"trackingID",
"optimizeRules",
"isRawResponse",
"employeeResponses",
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class FAQLAResponse {
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

	@JsonProperty("isRawResponse")
	private boolean isRawResponse;

	public boolean isRawResponse() {
		return isRawResponse;
	}
	public void setRawResponse(boolean isRawResponse) {
		this.isRawResponse = isRawResponse;
	}

	@JsonProperty("trackingID")
	private String trackingID;
	
	public String isTrackingID() {
		return trackingID;
	}
	public void setTrackingID(String trackingID) {
		this.trackingID = trackingID;
	}


	@JsonProperty("optimizeRules")
	private boolean optimizeRules;
	
	@JsonProperty("employeeResponses")
	private List<EmployeeResponse> employeeResponses;

	@JsonProperty("optimizeRules")
	public boolean getOptimizeRules() {
		return optimizeRules;
	}

	@JsonProperty("optimizeRules")
	public void setOptimizeRules(boolean optimizeRules) {
		this.optimizeRules = optimizeRules;
	}
	
	@JsonProperty("employeeResponses")
	public List<EmployeeResponse> getEmployeeResponses() {
		return employeeResponses;
	}

	@JsonProperty("employeeResponses")
	public void setEmployeeResponses(List<EmployeeResponse> employeeResponses) {
		this.employeeResponses = employeeResponses;
	}
	
	

}
