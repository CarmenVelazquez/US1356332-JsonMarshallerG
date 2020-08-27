package com.aa.cqe.crew.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class Crew {
	private FlightKey fltKey;
	private CrewSequenceKey sequenceKey;
	private String position;
	private String dutyPeriodNumber;
	private String employeeNumber;
	private String operationType;
	private String contractMonth;
}
