package com.aa.cqe.ruledistribution;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"eventType",
"timeStamp",
"trackingID",
"cqeTrackingID"
})

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event{
	
	@JsonProperty("eventType")
	private String eventType;
	
	@JsonProperty("timeStamp")
	private String timeStamp;
	
	@JsonProperty("trackingID")
	private String trackingID;
	
	@JsonProperty("cqeTrackingID")
	private String cqeTrackingID;
	
	@JsonProperty("eventType")
	public String getEventType() {
		return eventType;
	}
	
	@JsonProperty("eventType")
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	
	@JsonProperty("timeStamp")
	public String getTimeStamp() {
		return timeStamp;
	}
	
	@JsonProperty("timeStamp")
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	@JsonProperty("trackingID")
	public String getTrackingID() {
		return trackingID;
	}

	@JsonProperty("trackingID")
	public void setTrackingID(String trackingID) {
		this.trackingID = trackingID;
	}
	
	@JsonProperty("cqeTrackingID")
	public String getCqeTrackingID() {
		return cqeTrackingID;
	}
	
	@JsonProperty("cqeTrackingID")
	public void setCqeTrackingID(String cqeTrackingID) {
		this.cqeTrackingID = cqeTrackingID;
	}
	
}
