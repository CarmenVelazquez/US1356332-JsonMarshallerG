package com.aa.cqe.ccs.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"positionCode",
"sequenceNumber",
"sequenceOriginationDate",
"crewDHD",
"employeeNumber",
"base",
"firstName",
"lastName",
"nickName",
"seniorityNumber",
"cockpitQualifications",
"passportOrVisaInfos",
})

@JsonIgnoreProperties(ignoreUnknown = true)
public class CrewMembers {
	
	@JsonProperty("positionCode")
	private String positionCode;
	
	@JsonProperty("sequenceNumber")
	private String sequenceNumber;
	
	@JsonProperty("sequenceOriginationDate")
	private String sequenceOriginationDate;
	
	@JsonProperty("crewDHD")
	private boolean crewDHD;
	
	@JsonProperty("employeeNumber")
	private String employeeNumber;
	
	@JsonProperty("base")
	private String base;
	
	@JsonProperty("firstName")
	private String firstName;
	
	@JsonProperty("lastName")
	private String lastName;
	
	@JsonProperty("nickName")
	private String nickName;
	
	@JsonProperty("seniorityNumber")
	private String seniorityNumber;
	
	
	@JsonProperty("cockpitQualifications")
	private List<CockpitQualifications> cockpitQualifications;

	@JsonProperty("passportOrVisaInfos")
	private List<PassportOrVisaInfos> passportOrVisaInfos;
	 
	@JsonProperty("positionCode")
	public String getPositionCode() {
		return positionCode;
	}

	@JsonProperty("positionCode")
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}
	@JsonProperty("sequenceNumber")
	public String getSequenceNumber() {
		return sequenceNumber;
	}
	@JsonProperty("sequenceNumber")
	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	@JsonProperty("sequenceOriginationDate")
	public String getSequenceOriginationDate() {
		return sequenceOriginationDate;
	}
	@JsonProperty("sequenceOriginationDate")
	public void setSequenceOriginationDate(String sequenceOriginationDate) {
		this.sequenceOriginationDate = sequenceOriginationDate;
	}
	@JsonProperty("crewDHD")
	public boolean getCrewDHD() {
		return crewDHD;
	}
	@JsonProperty("crewDHD")
	public void setCrewDHD(boolean crewDHD) {
		this.crewDHD = crewDHD;
	}
	@JsonProperty("employeeNumber")
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	@JsonProperty("employeeNumber")
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	@JsonProperty("base")
	public String getBase() {
		return base;
	}
	@JsonProperty("base")
	public void setBase(String base) {
		this.base = base;
	}
	@JsonProperty("firstName")
	public String getFirstName() {
		return firstName;
	}
	@JsonProperty("firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@JsonProperty("lastName")
	public String getLastName() {
		return lastName;
	}
	@JsonProperty("lastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@JsonProperty("nickName")
	public String getNickName() {
		return nickName;
	}
	@JsonProperty("nickName")
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	@JsonProperty("seniorityNumber")
	public String getSeniorityNumber() {
		return seniorityNumber;
	}
	@JsonProperty("seniorityNumber")
	public void setSeniorityNumber(String seniorityNumber) {
		this.seniorityNumber = seniorityNumber;
	}
	@JsonProperty("cockpitQualifications")
	public List<CockpitQualifications> getCockpitQualifications() {
		return cockpitQualifications;
	}
	@JsonProperty("cockpitQualifications")
	public void setCockpitQualifications(List<CockpitQualifications> cockpitQualifications) {
		this.cockpitQualifications = cockpitQualifications;
	}
	@JsonProperty("passportOrVisaInfos")
	public List<PassportOrVisaInfos> getPassportOrVisaInfos() {
		return passportOrVisaInfos;
	}
	@JsonProperty("passportOrVisaInfos")
	public void setPassportOrVisaInfos(List<PassportOrVisaInfos> passportOrVisaInfos) {
		this.passportOrVisaInfos = passportOrVisaInfos;
	}

	 

}
