package com.aa.cqe.crew.pojo;

import com.google.gson.Gson;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class FlightCrewRuleEvent extends FlightCrewEvent{
	private String ruleName;
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
