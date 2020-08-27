package com.aa.cqe.ruledistribution;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"sequenceNumber",
"sequenceOrignDate",
"crewBase",
"crewType",
"airlineCode",
"fltKey",
"domesticOrInternational"
})


public class CrewSequenceKey {

	@JsonProperty("sequenceNumber")
	private String sequenceNumber;
	
	@JsonProperty("sequenceOrignDate")
    private String sequenceOrignDate;
	
	@JsonProperty("crewBase")
    private String crewBase;
	
	@JsonProperty("crewType")
    private String crewType;
	
	@JsonProperty("airlineCode")
    private String airlineCode;
	
	@JsonProperty("domesticOrInternational")
    private String domesticOrInternational;

	@JsonProperty("sequenceNumber")
	public String getSequenceNumber() {
		return sequenceNumber;
	}

	@JsonProperty("sequenceNumber")
	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	@JsonProperty("sequenceOrignDate")
	public String getSequenceOrignDate() {
		return sequenceOrignDate;
	}

	@JsonProperty("sequenceOrignDate")
	public void setSequenceOrignDate(String sequenceOrignDate) {
		this.sequenceOrignDate = sequenceOrignDate;
	}

	@JsonProperty("crewBase")
	public String getCrewBase() {
		return crewBase;
	}

	@JsonProperty("crewBase")
	public void setCrewBase(String crewBase) {
		this.crewBase = crewBase;
	}

	@JsonProperty("crewType")
	public String getCrewType() {
		return crewType;
	}

	@JsonProperty("crewType")
	public void setCrewType(String crewType) {
		this.crewType = crewType;
	}

	@JsonProperty("airlineCode")
	public String getAirlineCode() {
		return airlineCode;
	}

	@JsonProperty("airlineCode")
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	@JsonProperty("domesticOrInternational")
	public String getDomesticOrInternational() {
		return domesticOrInternational;
	}

	@JsonProperty("domesticOrInternational")
	public void setDomesticOrInternational(String domesticOrInternational) {
		this.domesticOrInternational = domesticOrInternational;
	}
    
	
    
}
