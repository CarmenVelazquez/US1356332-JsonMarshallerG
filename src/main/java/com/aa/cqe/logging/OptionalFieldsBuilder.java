package com.aa.cqe.logging;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class OptionalFieldsBuilder extends LogElementsBuilder{
	 public OptionalFieldsBuilder(LogElements logElements) {
		 this.logElements = logElements;
	 }
	 public OptionalFieldsBuilder fields(Map<String,Object> mapOptional,List<Object> lstParam) {
		 //Some json has differnt attribute for same value like airLineCode or IATA
		 String airLineCode = (String) getValue(mapOptional,"IATA");
		 airLineCode = airLineCode == null ? (String) getValue(mapOptional,"airlineCode") : airLineCode;
		 
		 logElements.setAirlineCode(airLineCode);
		 
		 String flightOriginDate = (String) getValue(mapOptional,"fltOrgDate");
		 flightOriginDate = flightOriginDate == null ? (String) getValue(mapOptional,"flightOriginationDate") : flightOriginDate;
		 
		 logElements.setFlightDate(flightOriginDate);
		 //logElements.setFlightOrigin(getValue(mapOptional,"flightOrigin"));
		 logElements.setFlightDestination((String)getValue(mapOptional, "depSta"));
		 logElements.setFlightNum((String)getValue(mapOptional,"fltNum"));
		 logElements.setDupDepCode((String)getValue(mapOptional,"dupDepStaNum"));
		 logElements.setTrackingId((String)getValue(mapOptional,"trackingID"));
		 //For Error Elements
		 logElements.setCause((String)getValue(mapOptional,"cause"));
		 logElements.setStackTrace((String[])getValue(mapOptional,"stackTrace"));
		 
		 if(lstParam.contains("flightKey")) {
			 logElements.setFlightKey(MessageFormat.format("{0},{1},{2},{3},{4}", logElements.getFlightNum(),
				 	logElements.getFlightDate(),logElements.getFlightDestination(),logElements.getDupDepCode(), logElements.getAirlineCode()));
		 }
		 return this;
	 }
	 
	 private Object getValue(final Map<String,Object> mapOptional,final String key) {
		 return mapOptional.get(key) == null ? null : mapOptional.get(key);
	 }
}
