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
	@JsonProperty("pickups")
	private List<MessageKey> pickups;
	@JsonProperty("drop")
	private List<MessageKey> drop;
	
	private MessageKey affectedBy;
	
    private ActivityType affectedType;
	
	public ActivityType getAffectedType() {
		return affectedType;
	}

	public void setAffectedType(ActivityType affectedType) {
		this.affectedType = affectedType;
	}

	public MessageKey getAffectedBy() {
		return affectedBy;
	}

	public void setAffectedBy(MessageKey affectedBy) {
		this.affectedBy = affectedBy;
	}

	public List<MessageKey> getPickups() {
		return pickups;
	}

	public void setPickups(List<MessageKey> pickups) {
		this.pickups = pickups;
	}

	public List<MessageKey> getDrop() {
		return drop;
	}

	public void setDrop(List<MessageKey> drop) {
		this.drop = drop;
	}

}
