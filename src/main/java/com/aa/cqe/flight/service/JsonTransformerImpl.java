package com.aa.cqe.flight.service;


import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTransformerImpl<T> implements JsonTransformer<T>{
	
	private static Logger LOG = LogManager.getLogger(JsonTransformerImpl.class);
	private ObjectMapper mapper;
	

	@Override
	public T unmarshallEvent(String jsonString, Class className) {
		if(jsonString == null || jsonString.trim().isEmpty()) {
			LOG.error("unmarshalFlightEvent: flight event is empty");
			return null;
		}
		if(mapper == null){
			mapper = new ObjectMapper();
		}
	    try {
	    	return (T) mapper.readValue(jsonString, className);
	    } catch (Exception e) {
	    	LOG.error("Flight Event unmarshaller ERROR: ", e);
	    }
	    return null;
	}
	
	
	@SuppressWarnings("unchecked")
	public T unmarshallAnonymousJson(String jsonString, TypeReference<T> typeRef) {
		if(jsonString == null || jsonString.trim().isEmpty()) {
			LOG.error("unmarshalFlightEvent: flight event is empty");
			return null;
		}
		if(mapper == null){
			mapper = new ObjectMapper();
		}
	    try {
	    	List<T> list = new ArrayList<>();
	    	list.add((T) "sss");
//	    	TypeReference<T> typeRef = new TypeReference<T>() {};
	    	return mapper.readValue(jsonString, typeRef);
	    } catch (Exception e) {
	    	LOG.error("Flight Event unmarshaller ERROR: ", e);
	    }
	    return null;
	}

	
}
