package com.aa.cqe.crew.pojo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@JsonIgnoreProperties(ignoreUnknown = true)
public @Data class Event{

	private String eventType;
	private String timeStamp;
}
