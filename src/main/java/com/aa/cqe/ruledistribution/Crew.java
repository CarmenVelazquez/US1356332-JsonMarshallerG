package com.aa.cqe.ruledistribution;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"employeeNumber",
"operationType",
"contractMonth",
"dutyPeriodNumber",
"position",
"fltKey",
"sequenceKey"
})

public class Crew {
	
	@JsonProperty("fltKey")
	private FlightKey fltKey;
	
	@JsonProperty("sequenceKey")
	private CrewSequenceKey sequenceKey;
	
	@JsonProperty("position")
	private String position;
	
	@JsonProperty("dutyPeriodNumber")
	private String dutyPeriodNumber;
	
	@JsonProperty("employeeNumber")
	private int employeeNumber;
	
	@JsonProperty("operationType")
	private String operationType;
	
	@JsonProperty("contractMonth")
	private String contractMonth;

	@JsonProperty("fltKey")
	public FlightKey getFltKey() {
		return fltKey;
	}

	@JsonProperty("fltKey")
	public void setFltKey(FlightKey fltKey) {
		this.fltKey = fltKey;
	}

	@JsonProperty("sequenceKey")
	public CrewSequenceKey getSequenceKey() {
		return sequenceKey;
	}

	@JsonProperty("sequenceKey")
	public void setSequenceKey(CrewSequenceKey sequenceKey) {
		this.sequenceKey = sequenceKey;
	}

	@JsonProperty("position")
	public String getPosition() {
		return position;
	}

	@JsonProperty("position")
	public void setPosition(String position) {
		this.position = position;
	}

	@JsonProperty("dutyPeriodNumber")
	public String getDutyPeriodNumber() {
		return dutyPeriodNumber;
	}

	@JsonProperty("dutyPeriodNumber")
	public void setDutyPeriodNumber(String dutyPeriodNumber) {
		this.dutyPeriodNumber = dutyPeriodNumber;
	}

	@JsonProperty("employeeNumber")
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	@JsonProperty("employeeNumber")
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@JsonProperty("operationType")
	public String getOperationType() {
		return operationType;
	}

	@JsonProperty("operationType")
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	@JsonProperty("contractMonth")
	public String getContractMonth() {
		return contractMonth;
	}

	@JsonProperty("contractMonth")
	public void setContractMonth(String contractMonth) {
		this.contractMonth = contractMonth;
	}
	
	
	
}
