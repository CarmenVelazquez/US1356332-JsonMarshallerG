package com.aa.cqe.ruledistribution;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.Gson;

public class FlightCrewRuleEvent extends FlightCrewEvent{
	
	@JsonProperty("ruleName")
	private String ruleName;
	
	@JsonProperty("ruleName")
	public String getRuleName() {
		return ruleName;
	}

	@JsonProperty("ruleName")
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
