package com.aa.cqe.logging;

public class LogElementsBuilder{
	 protected LogElements logElements = new LogElements(); 
	 public LogElementsBuilder() {
	 }
	
	 public LogElementsBuilder(String _applicationId, String _applicationOrServiceName,String _componentId, String _filters) {
		 logElements.set_applicationId(_applicationId);
		 logElements.set_applicationOrServiceName(_applicationOrServiceName);
		 logElements.set_componentId(_componentId);
		 logElements.set_filters(_filters);
	 }
	 public TimeZoneBuilder time() {
		 return new TimeZoneBuilder(logElements);
	 }
	 
	 public LogLevelBuilder level() {
		 return new LogLevelBuilder(logElements);
	 }
	 public OptionalFieldsBuilder optionalFields() {
		 return new OptionalFieldsBuilder(logElements);
	 }
	 public MessageBuilder message() {
		return new MessageBuilder(logElements); 
	 }
	 
	 public LogElements build() {
		 return logElements;
	 }
}
 
