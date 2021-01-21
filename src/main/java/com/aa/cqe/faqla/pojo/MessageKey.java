package com.aa.cqe.faqla.pojo;
import java.beans.Transient;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "airlineCode", "contractMonth", "activityId", "startDateTime", "endDateTime", "activityType",
		"activityOriginationDate", "positionCode",

})
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageKey {
	
	private String airlineCode;

    private String airportCode;

    private String contractMonth;

    private int activityId;

    private String activityCode;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    private ActivityType activityType;

    private String activityOriginationDate;

    private String positionCode;

    private String departureAirport;

    private int departureStationDupe;

    private String arrivalAirport;

    private int legIndex;

    private int dutyPeriod;

    public MessageKey(final String airlineCode, final String contractMonth, final int activityId, final ActivityType activityType,
            final String activityOriginationDate,
            final String positionCode) {
        super();
        this.airlineCode = airlineCode;
        this.contractMonth = contractMonth;
        this.activityId = activityId;
        this.activityType = activityType;
        this.activityOriginationDate = activityOriginationDate;
        this.positionCode = positionCode;
    }

    public MessageKey(final String airlineCode, final String contractMonth, final int activityId, final ActivityType activityType,
            final String activityOriginationDate,
            final int legIndex, final int dutyPeriod, final String departureAirport, final String arrivalAirport,
            final int departureStationDupe) {
        super();
        this.airlineCode = airlineCode;
        this.contractMonth = contractMonth;
        this.activityId = activityId;
        this.activityType = activityType;
        this.activityOriginationDate = activityOriginationDate;
        this.legIndex = legIndex;
        this.dutyPeriod = dutyPeriod;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureStationDupe = departureStationDupe;

    }

    public MessageKey() {

    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MessageKey other = (MessageKey) obj;
        if (airlineCode == null) {
            if (other.airlineCode != null) {
                return false;
            }
        } else if (!airlineCode.equals(other.airlineCode)) {
            return false;
        }
        if (contractMonth == null) {
            if (other.contractMonth != null) {
                return false;
            }
        } else if (!contractMonth.equals(other.contractMonth)) {
            return false;
        }
        if (activityOriginationDate == null) {
            if (other.activityOriginationDate != null) {
                return false;
            }
        } else if (!activityOriginationDate.equals(other.activityOriginationDate)) {
            return false;
        }
        if (startDateTime == null) {
            if (other.startDateTime != null) {
                return false;
            }
        } else if (!startDateTime.equals(other.startDateTime)) {
            return false;
        }
        if (positionCode == null) {
            if (other.positionCode != null) {
                return false;
            }
        } else if (!positionCode.equals(other.positionCode)) {
            return false;
        }
        if (activityId != other.activityId) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((airlineCode == null) ? 0 : airlineCode.hashCode());
        result = prime * result + ((contractMonth == null) ? 0 : contractMonth.hashCode());
        result = prime * result + ((activityOriginationDate == null) ? 0 : activityOriginationDate.hashCode());
        result = prime * result + ((positionCode == null) ? 0 : positionCode.hashCode());
        result = prime * result + activityId;
        return result;
    }

}
