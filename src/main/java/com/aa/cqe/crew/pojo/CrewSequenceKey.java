package com.aa.cqe.crew.pojo;

import lombok.Data;

public @Data class CrewSequenceKey {

	private String sequenceNumber;
    private String sequenceOrignDate;
    private String crewBase;
    private String crewType;
    private String airlineCode;
    private String domesticOrInternational;
}
