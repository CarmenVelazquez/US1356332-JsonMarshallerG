package com.aa.cqe.ccs.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"licenseType",
"countryName",
"expirationDate",
})
public class PassportOrVisaInfos {
	
	@JsonProperty("licenseType")
	private String licenseType;
	
	@JsonProperty("countryName")
	private String countryName;
	
	@JsonProperty("expirationDate")
	private String expirationDate;

	@JsonProperty("licenseType")
	public String getLicenseType() {
		return licenseType;
	}
	@JsonProperty("licenseType")
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}
	@JsonProperty("countryName")
	public String getCountryName() {
		return countryName;
	}
	@JsonProperty("countryName")
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@JsonProperty("expirationDate")
	public String getExpirationDate() {
		return expirationDate;
	}
	@JsonProperty("expirationDate")
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
}
