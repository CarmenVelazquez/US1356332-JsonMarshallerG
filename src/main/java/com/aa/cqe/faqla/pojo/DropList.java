package com.aa.cqe.faqla.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"activityType",
"airlineCode",
"activityId",
"activityOriginationDate",
"contractMonth",
"positionCode",
})

@JsonIgnoreProperties(ignoreUnknown = true)
public class DropList {
	@JsonProperty("activityType")
	private String activityType;
	@JsonProperty("airlineCode")
	private String airlineCode;
	@JsonProperty("activityId")
	private int activityId;
	@JsonProperty("activityOriginationDate")
	private String activityOriginationDate;
	@JsonProperty("contractMonth")
	private String contractMonth;
	@JsonProperty("positionCode")
	private String positionCode;
	@JsonProperty("activityType")
	public String getActivityType() {
		return activityType;
	}
	@JsonProperty("activityType")
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}
	@JsonProperty("airlineCode")
	public String getAirlineCode() {
		return airlineCode;
	}
	@JsonProperty("airlineCode")
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}
	@JsonProperty("activityId")
	public int getActivityId() {
		return activityId;
	}
	@JsonProperty("activityId")
	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}
	@JsonProperty("activityOriginationDate")
	public String getActivityOriginationDate() {
		return activityOriginationDate;
	}
	@JsonProperty("activityOriginationDate")
	public void setActivityOriginationDate(String activityOriginationDate) {
		this.activityOriginationDate = activityOriginationDate;
	}
	@JsonProperty("contractMonth")
	public String getContractMonth() {
		return contractMonth;
	}
	@JsonProperty("contractMonth")
	public void setContractMonth(String contractMonth) {
		this.contractMonth = contractMonth;
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
