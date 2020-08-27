package com.aa.cqe.crew.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public @Data class FlightCrewEvent extends Event {
	
	private Crew crew;

}
