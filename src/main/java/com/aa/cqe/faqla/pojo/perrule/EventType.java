package com.aa.cqe.faqla.pojo.perrule;

import java.util.List;

import com.aa.cqe.ruledistribution.CrewSequenceKey;
import com.aa.cqe.ruledistribution.FlightKey;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EventType {
	

	
	@JsonProperty("trackingID")
	private String trackingID;

	@JsonProperty("timeStamp")
	private String timeStamp;
	
	@JsonProperty("employeeID")
	private String employeeID;

	@JsonProperty("position")
	private String position;

	@JsonProperty("fltKey")
	private FlightKey fltKey;

	@JsonProperty("sequenceKey")
	private CrewSequenceKey sequenceKey;

	@JsonProperty("messages")
	private List<String> messages;
	
	@JsonProperty("timeStamp")
	public String getTimeStamp() {
		return timeStamp;
	}
	@JsonProperty("timeStamp")
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	public String getTrackingID() {
		return trackingID;
	}

	public void setTrackingID(String trackingID) {
		this.trackingID = trackingID;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public FlightKey getFltKey() {
		return fltKey;
	}

	public void setFltKey(FlightKey fltKey) {
		this.fltKey = fltKey;
	}

	public CrewSequenceKey getSequenceKey() {
		return sequenceKey;
	}

	public void setSequenceKey(CrewSequenceKey sequenceKey) {
		this.sequenceKey = sequenceKey;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	
	

	
}
