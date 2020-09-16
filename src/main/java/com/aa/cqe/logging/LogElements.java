package com.aa.cqe.logging;

import com.aa.cqe.errorhandler.ErrorCode;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.Gson;

import lombok.Data;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	 "_applicationId",
	 "_applicationOrServiceName",
	 "_componentId",
	 "_filters",
	 "_timeMillisInUTC",
	 "_timestamp",
	 "_classification",
	 "threadName",
	 "trackingId",
	 "className",
	 "level",
	 "flightKey",
	 "flightNum",
	 "flightDate",
	 "flightOrigin",
	 "flightDestination",
	 "dupDepCode",
	 "airlineCode"
})
public class LogElements {
	private String _applicationId;
	private String _applicationOrServiceName;
	private String _componentId;
	private String _filters;
	private String _timeMillisInUTC;
	private String _timestamp;
	private String _classification;
	private String threadName;
	private String className;
	private String level;
// Optional fields start here
	private String trackingId;
	private String flightKey;
	private String flightNum;
	private String flightDate;
	private String flightOrigin;
	private String flightDestination;
	private String dupDepCode;
	private String airlineCode;
// Error Handling fields start here	
	private String cause;
	private String[] stackTrace;
	
	
	private Message msgs;
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
	
}