package com.aa.cqe.ccs.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"equipmentGroup",
"landingExpirationDate",
"lastFlownDate",
"currentQualification",
"restricted75hr",
"position"
})

//@JsonIgnoreProperties(value = { "divisionQuals" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class CockpitQualifications {
	
	@JsonProperty("equipmentGroup")
	private String equipmentGroup;
	
	@JsonProperty("landingExpirationDate")
	private String landingExpirationDate;
	
	@JsonProperty("lastFlownDate")
	private String lastFlownDate;
	
	@JsonProperty("currentQualification")
	private CurrentQualification currentQualification;
	
	
	/*
	 * @JsonProperty("divisionQuals") private List<DivisionQuals> divisionQuals;
	 */
	
	@JsonProperty("restricted75hr")
	private boolean restricted75hr;
	
	@JsonProperty("position")
	private String position;

	public String getLastFlownDate() {
		return lastFlownDate;
	}

	public void setLastFlownDate(String lastFlownDate) {
		this.lastFlownDate = lastFlownDate;
	}

	@JsonProperty("equipmentGroup")
	public String getEquipmentGroup() {
		return equipmentGroup;
	}

	@JsonProperty("equipmentGroup")
	public void setEquipmentGroup(String equipmentGroup) {
		this.equipmentGroup = equipmentGroup;
	}

	@JsonProperty("landingExpirationDate")
	public String getLandingExpirationDate() {
		return landingExpirationDate;
	}
	@JsonProperty("landingExpirationDate")
	public void setLandingExpirationDate(String landingExpirationDate) {
		this.landingExpirationDate = landingExpirationDate;
	}
	@JsonProperty("currentQualification")
	public CurrentQualification getCurrentQualification() {
		return currentQualification;
	}
	@JsonProperty("currentQualification")
	public void setCurrentQualification(CurrentQualification currentQualification) {
		this.currentQualification = currentQualification;
	}

	/*
	 * @JsonProperty("divisionQuals") public List<DivisionQuals> getDivisionQuals()
	 * { return divisionQuals; }
	 * 
	 * @JsonProperty("divisionQuals") public void
	 * setDivisionQuals(List<DivisionQuals> divisionQuals) { this.divisionQuals =
	 * divisionQuals; }
	 */
	 
	@JsonProperty("restricted75hr")
	public boolean isRestricted75hr() {
		return restricted75hr;
	}
	@JsonProperty("restricted75hr")
	public void setRestricted75hr(boolean restricted75hr) {
		this.restricted75hr = restricted75hr;
	}
	@JsonProperty("position")
	public String getPosition() {
		return position;
	}
	@JsonProperty("position")
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
}
