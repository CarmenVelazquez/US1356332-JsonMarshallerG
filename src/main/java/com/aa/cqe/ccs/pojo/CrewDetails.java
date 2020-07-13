package com.aa.cqe.ccs.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"airlineCode",
"flightNumber",
"flightOriginationDate",
"departureCity",
"numberOfCrewMembers",
"crewMembers",
"duplicateDepartureCode"
})

public class CrewDetails {
	
	@JsonProperty("airlineCode")
	private String airlineCode;
	
	@JsonProperty("flightNumber")
	private String flightNumber;
	
	@JsonProperty("flightOriginationDate")
	private String flightOriginationDate;
	
	@JsonProperty("departureCity")
	private String departureCity;
	
	@JsonProperty("numberOfCrewMembers")
	private int numberOfCrewMembers;
	
	@JsonProperty("crewMembers")
	private List<CrewMembers> crewMembers;
	 
	@JsonProperty("crewMembers")
	public List<CrewMembers> getCrewMembers() {
		return crewMembers;
	}

	@JsonProperty("crewMembers")
	public void setCrewMembers(List<CrewMembers> crewMembers) {
		this.crewMembers = crewMembers;
	}

	@JsonProperty("duplicateDepartureCode")
	private String duplicateDepartureCode;

	@JsonProperty("airlineCode")
	public String getAirlineCode() {
		return airlineCode;
	}

	@JsonProperty("airlineCode")
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	@JsonProperty("flightNumber")
	public String getFlightNumber() {
		return flightNumber;
	}

	@JsonProperty("flightNumber")
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
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

	@JsonProperty("numberOfCrewMembers")
	public int getNumberOfCrewMembers() {
		return numberOfCrewMembers;
	}

	@JsonProperty("numberOfCrewMembers")
	public void setNumberOfCrewMembers(int numberOfCrewMembers) {
		this.numberOfCrewMembers = numberOfCrewMembers;
	}

	@JsonProperty("duplicateDepartureCode")
	public String getDuplicateDepartureCode() {
		return duplicateDepartureCode;
	}

	@JsonProperty("duplicateDepartureCode")
	public void setDuplicateDepartureCode(String duplicateDepartureCode) {
		this.duplicateDepartureCode = duplicateDepartureCode;
	}
	
	

}
