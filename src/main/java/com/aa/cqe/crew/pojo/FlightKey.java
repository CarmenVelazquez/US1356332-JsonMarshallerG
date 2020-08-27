package com.aa.cqe.crew.pojo;

import com.aa.cqe.flight.pojo.Flight;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class FlightKey {
	private String flightNumber;
    private String airlineCode;
    private String flightOriginationDate;
    private String departureCity;
    private Integer duplicateDepartureCode;
    
    public FlightKey(Flight flight) {
    	airlineCode = flight.getKey().getAirlineCode().getIATA();
    	departureCity = flight.getKey().getDepSta();
		flightNumber = flight.getKey().getFltNum();
		flightOriginationDate = flight.getKey().getFltOrgDate();
		duplicateDepartureCode = Integer.parseInt(flight.getKey().getDupDepStaNum());
    }
}
