package com.aa.cqe.flightwrap;

import com.aa.cqe.flight.pojo.Flight;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.Gson;

import lombok.Data;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"cqeTrackingID","Flight"})
public @Data class FlightWrapper {
	@JsonProperty
	String cqeTrackingID;
	@JsonProperty
	Flight flight;
	
	@Override
    public String toString() {
    	return new Gson().toJson(this);
    }
}
