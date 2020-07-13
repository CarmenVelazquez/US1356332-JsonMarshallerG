package com.aa.cqe.contractmonth.pojo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "contractMonthKey", "type", "startDate", "endDate", "startTime", "endTime", "sourceTimeStamp" })
public class ContractMonth {

	@JsonProperty("contractMonthKey")
	private ContractMonthKey contractMonthKey;
	@JsonProperty("type")
	private String type;
	@JsonProperty("startDate")
	private String startDate;
	@JsonProperty("endDate")
	private String endDate;
	@JsonProperty("startTime")
	private String startTime;
	@JsonProperty("endTime")
	private String endTime;
	@JsonProperty("sourceTimeStamp")
	private String sourceTimeStamp;
	private LocalDate startDateLocalDate;
	private LocalDate endDateLocalDate;
	
	@JsonProperty("contractMonthKey")
	public ContractMonthKey getContractMonthKey() {
		return contractMonthKey;
	}

	@JsonProperty("contractMonthKey")
	public void setContractMonthKey(ContractMonthKey contractMonthKey) {
		this.contractMonthKey = contractMonthKey;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("startDate")
	public String getStartDate() {
		return startDate;
	}

	@JsonProperty("startDate")
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@JsonProperty("endDate")
	public String getEndDate() {
		return endDate;
	}

	@JsonProperty("endDate")
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	@JsonProperty("startTime")
	public String getStartTime() {
		return startTime;
	}

	@JsonProperty("startTime")
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	@JsonProperty("endTime")
	public String getEndTime() {
		return endTime;
	}

	@JsonProperty("endTime")
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@JsonProperty("sourceTimeStamp")
	public String getSourceTimeStamp() {
		return sourceTimeStamp;
	}

	@JsonProperty("sourceTimeStamp")
	public void setSourceTimeStamp(String sourceTimeStamp) {
		this.sourceTimeStamp = sourceTimeStamp;
	}

	public LocalDate getStartDateLocalDate() {
		return startDateLocalDate;
	}

	public void setStartDateLocalDate(LocalDate startDateLocalDate) {
		this.startDateLocalDate = startDateLocalDate;
	}

	public LocalDate getEndDateLocalDate() {
		return endDateLocalDate;
	}

	public void setEndDateLocalDate(LocalDate endDateLocalDate) {
		this.endDateLocalDate = endDateLocalDate;
	}
}