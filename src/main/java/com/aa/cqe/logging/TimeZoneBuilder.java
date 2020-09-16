package com.aa.cqe.logging;

public class TimeZoneBuilder extends LogElementsBuilder {
	
	public TimeZoneBuilder(LogElements logElements) {
		this.logElements = logElements;
	}
	public TimeZoneBuilder timeLocal(String timeLocal) {
		logElements.set_timestamp(timeLocal);
		return this;
	}
	public TimeZoneBuilder timeUTC(String utcTime) {
		logElements.set_timeMillisInUTC(utcTime);
		return this;
	}

}
