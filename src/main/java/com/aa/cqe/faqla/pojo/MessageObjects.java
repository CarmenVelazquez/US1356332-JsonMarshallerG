package com.aa.cqe.faqla.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"affectedType",
"affectedStartDateTime",
"pickups",
"affectedBy",
})

@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageObjects {
	@JsonProperty("affectedType")
	private String affectedType;
	@JsonProperty("affectedStartDateTime")
	private String affectedStartDateTime;
	@JsonProperty("pickups")
	private List<PickUps> pickups;
	@JsonProperty("affectedBy")
	private AffectedBy affectedBy;
	
	@JsonProperty("affectedType")
	public String getAffectedType() {
		return affectedType;
	}	
	
	@JsonProperty("affectedType")
	public void setAffectedType(String affectedType) {
		this.affectedType = affectedType;
	}	
	
	@JsonProperty("affectedStartDateTime")
	public String getAffectedStartDateTime() {
		return affectedStartDateTime;
	}	
	
	@JsonProperty("affectedStartDateTime")
	public void setAffectedStartDateTime(String affectedStartDateTime) {
		this.affectedStartDateTime = affectedStartDateTime;
	}	
	
	@JsonProperty("pickups")	
	public List<PickUps> getPickups() {
		return pickups;
	}
	
	@JsonProperty("pickups")
	public void setPickups(List<PickUps> pickups) {
		this.pickups = pickups;
	}

	@JsonProperty("affectedBy")
	public AffectedBy getAffectedBy() {
		return affectedBy;
	}	
	
	@JsonProperty("affectedBy")
	public void setAffectedBy(AffectedBy affectedBy) {
		this.affectedBy = affectedBy;
	}
	
	
	
}
