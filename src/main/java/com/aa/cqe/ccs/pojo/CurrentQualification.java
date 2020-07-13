package com.aa.cqe.ccs.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"captain",
"firstOfficer",
"flightEngineer",
})
public class CurrentQualification {
	
	@JsonProperty("captain")
	private boolean captain;
	
	@JsonProperty("firstOfficer")
	private boolean firstOfficer;
	
	@JsonProperty("flightEngineer")
	private boolean flightEngineer;

	@JsonProperty("captain")
	public boolean isCaptain() {
		return captain;
	}

	@JsonProperty("captain")
	public void setCaptain(boolean captain) {
		this.captain = captain;
	}

	@JsonProperty("firstOfficer")
	public boolean isFirstOfficer() {
		return firstOfficer;
	}

	@JsonProperty("firstOfficer")
	public void setFirstOfficer(boolean firstOfficer) {
		this.firstOfficer = firstOfficer;
	}

	@JsonProperty("flightEngineer")
	public boolean isFlightEngineer() {
		return flightEngineer;
	}

	@JsonProperty("flightEngineer")
	public void setFlightEngineer(boolean flightEngineer) {
		this.flightEngineer = flightEngineer;
	}
	
}
