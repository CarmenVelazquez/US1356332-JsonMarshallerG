package com.aa.cqe.ruledistribution;

import com.aa.cqe.flight.pojo.Flight;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"flightNumber",
"airlineCode",
"flightOriginationDate",
"departureCity",
"duplicateDepartureCode",
})

public class FlightKey {
	
	@JsonProperty("flightNumber")
	private String flightNumber;
	
	@JsonProperty("airlineCode")
    private String airlineCode;
	
	@JsonProperty("flightOriginationDate")
    private String flightOriginationDate;
	
	@JsonProperty("departureCity")
    private String departureCity;
	
	@JsonProperty("duplicateDepartureCode")
    private Integer duplicateDepartureCode;
	
	@JsonProperty("flightNumber")
    public String getFlightNumber() {
		return flightNumber;
	}

	@JsonProperty("flightNumber")
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	@JsonProperty("airlineCode")
	public String getAirlineCode() {
		return airlineCode;
	}

	@JsonProperty("airlineCode")
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}
	
	@JsonProperty("flightOriginationDate")
	public String getFlightOriginationDate() {
		return flightOriginationDate;
	}

	@JsonProperty("flightOriginationDate")
	public void setFlightOriginationDate(String flightOriginationDate) {
		this.flightOriginationDate = flightOriginationDate;
	}

	@JsonProperty("departureCity")
	public String getDepartureCity() {
		return departureCity;
	}

	@JsonProperty("departureCity")
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	@JsonProperty("duplicateDepartureCode")
	public Integer getDuplicateDepartureCode() {
		return duplicateDepartureCode;
	}

	@JsonProperty("duplicateDepartureCode")
	public void setDuplicateDepartureCode(Integer duplicateDepartureCode) {
		this.duplicateDepartureCode = duplicateDepartureCode;
	}
}
