package com.aa.cqe.ruledistribution;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public  class FlightCrewEvent extends Event {
	
	@JsonProperty("crew")
	private Crew crew;

	@JsonProperty("crew")
	public Crew getCrew() {
		return crew;
	}

	@JsonProperty("crew")
	public void setCrew(Crew crew) {
		this.crew = crew;
	}
	
	

}
