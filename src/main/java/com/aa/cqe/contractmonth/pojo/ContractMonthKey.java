package com.aa.cqe.contractmonth.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "fosPartitionCode", "contractMonth" })
public class ContractMonthKey {

	@JsonProperty("fosPartitionCode")
	private String fosPartitionCode;
	@JsonProperty("contractMonth")
	private String contractMonth;

	@JsonProperty("fosPartitionCode")
	public String getFosPartitionCode() {
		return fosPartitionCode;
	}

	@JsonProperty("fosPartitionCode")
	public void setFosPartitionCode(String fosPartitionCode) {
		this.fosPartitionCode = fosPartitionCode;
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