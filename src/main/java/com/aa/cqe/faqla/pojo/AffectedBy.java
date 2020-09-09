package com.aa.cqe.faqla.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "airlineCode", "contractMonth", "activityId", "startDateTime", "endDateTime", "activityType",
		"activityOriginationDate", "positionCode",
})

@JsonIgnoreProperties(ignoreUnknown = true)
public class AffectedBy {

	@JsonProperty("airlineCode")
	private String airlineCode;
	@JsonProperty("contractMonth")
	private String contractMonth;
	@JsonProperty("activityId")
	private String activityId;
	@JsonProperty("startDateTime")
	private String startDateTime;
	@JsonProperty("endDateTime")
	private String endDateTime;
	@JsonProperty("activityType")
	private String activityType;
	@JsonProperty("activityOriginationDate")
	private String activityOriginationDate;
	@JsonProperty("positionCode")
	private String positionCode;
	
	@JsonProperty("airlineCode")
	public String getAirlineCode() {
		return airlineCode;
	}

	@JsonProperty("airlineCode")
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}
	@JsonProperty("contractMonth")
	public String getContractMonth() {
		return contractMonth;
	}
	@JsonProperty("contractMonth")
	public void setContractMonth(String contractMonth) {
		this.contractMonth = contractMonth;
	}
	@JsonProperty("activityId")
	public String getActivityId() {
		return activityId;
	}
	@JsonProperty("activityId")
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	@JsonProperty("startDateTime")
	public String getStartDateTime() {
		return startDateTime;
	}
	
	@JsonProperty("startDateTime")
	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}
	
	@JsonProperty("endDateTime")
	public String getEndDateTime() {
		return endDateTime;
	}
	
	@JsonProperty("endDateTime")
	public void setEndDateTime(String endDateTime) {
		this.endDateTime = endDateTime;
	}
	
	@JsonProperty("activityType")
	public String getActivityType() {
		return activityType;
	}
	
	@JsonProperty("activityType")
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}
	
	@JsonProperty("activityOriginationDate")
	public String getActivityOriginationDate() {
		return activityOriginationDate;
	}
	
	@JsonProperty("activityOriginationDate")
	public void setActivityOriginationDate(String activityOriginationDate) {
		this.activityOriginationDate = activityOriginationDate;
	}
	
	@JsonProperty("positionCode")
	public String getPositionCode() {
		return positionCode;
	}
	
	@JsonProperty("positionCode")
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

}
