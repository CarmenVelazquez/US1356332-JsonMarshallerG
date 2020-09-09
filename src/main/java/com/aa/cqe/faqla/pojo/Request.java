package com.aa.cqe.faqla.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Request {
	
	@JsonProperty("requestId")
	private int requestId;
	@JsonProperty("ruleTypes")
	private List<String> ruleTypes;
	@JsonProperty("pickupDutyList")
	private List<PickupDutyList> pickupDutyList;
	@JsonProperty("requestId")
	public int getRequestId() {
		return requestId;
	}
	@JsonProperty("requestId")
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	@JsonProperty("ruleTypes")
	public List<String> getRuleTypes() {
		return ruleTypes;
	}
	@JsonProperty("ruleTypes")
	public void setRuleTypes(List<String> ruleTypes) {
		this.ruleTypes = ruleTypes;
	}
	@JsonProperty("pickupDutyList")
	public List<PickupDutyList> getPickupDutyList() {
		return pickupDutyList;
	}
	@JsonProperty("pickupDutyList")
	public void setPickupDutyList(List<PickupDutyList> pickupDutyList) {
		this.pickupDutyList = pickupDutyList;
	}
	
	
	
}
