package com.aa.cqe.flightwrap;

import com.aa.cqe.flight.pojo.Flight;

import lombok.Data;

public @Data class FlightWrapper {
	String cqeTrackingID;
	Flight flight;
}
