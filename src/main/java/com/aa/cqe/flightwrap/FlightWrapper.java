package com.aa.cqe.flightwrap;

import com.aa.cqe.flight.pojo.Flight;
import com.google.gson.Gson;

import lombok.Data;

public @Data class FlightWrapper {
	String cqeTrackingID;
	Flight flight;
	
	@Override
    public String toString() {
    	return new Gson().toJson(this);
    }
}
