package com.aa.cqe.logging;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ErrorFieldsBuilder extends LogElementsBuilder{
	 public ErrorFieldsBuilder(LogElements logElements) {
		 this.logElements = logElements;
	 }
	 public ErrorFieldsBuilder fields(Map<String,Object> mapOptional,List<String> lstParam) {
		 //Some json has differnt attribute for same value like airLineCode or IATA
		 logElements.setCause(getValue(mapOptional,"cause").toString());
		 logElements.setStackTrace((String[]) getValue(mapOptional,"stackTrace"));
		
		 return this;
	 }
	 
	 private Object getValue(final Map<String,Object> mapOptional,final String key) {
		 return mapOptional.get(key) == null ? null : mapOptional.get(key);
	 }
}
