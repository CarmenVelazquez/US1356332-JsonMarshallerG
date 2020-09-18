package com.aa.cqe.logging;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.logging.log4j.core.LogEvent;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.util.StringUtils;

import com.aa.cqe.utility.Constants;
import com.aa.cqe.utility.PropertyReader;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;



public class FormatMapMessages {
	
	private String _filters="Analytics";
	private LogElementsBuilder logElementsBuilder;
	private PropertyReader propertyReader = null;
	public static final TimeZone UTC = TimeZone.getTimeZone("UTC");
	
	public Map<String,Object> getFormattedMessage(LogEvent event) throws ParseException, IOException {
		
		String regex =  "(\\r\\n|\\t|\\\\|\\u003d|\\u0027)";
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern(Constants.TIME_FORMAT);
		
	    ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.now(), ZoneId.of(Constants.UTC));
	    propertyReader = PropertyReader.getInstance();
	    List<String> filters = new ArrayList<>();
	    
	    Object[] parameters = event.getMessage().getParameters();
	    String formatedString = event.getMessage().getFormattedMessage();
	    StringBuilder sb = new StringBuilder(formatedString);
	    LinkedHashMap<String,Object> logElementsMap = new LinkedHashMap<>();
	    String message = sb.toString().replaceAll(regex, "");
	    logElementsMap.put(Constants.CONFIG_APPLICATION_ID, propertyReader.applicationId);
	    logElementsMap.put(Constants.CONFIG_APPLICATION_NAME,propertyReader.applicationName);
	    logElementsMap.put(Constants.CONFIG_COMPONENT_ID, propertyReader.componentId);
	    
	    List<Object> lstParam =  parameters == null? null : new LinkedList(Arrays.asList(parameters));
	    
	    //All for filter parameters
	    filters.add("Analytics");
	    if(lstParam != null) {
		    String filterParam = lstParam.get(0).toString();
		    String[] filterStr = filterParam.split(":");
		    if(filterStr[0].equalsIgnoreCase("filter") && !StringUtils.isEmpty(filterStr[1])) {
		    	lstParam.remove(0);
		    	String[] filterName = filterStr[1].split(",");
		    	for(int i=0;i < filterName.length; i++) {
		    		filters.add(filterName[i]);
		    	}
		    }
	    }
	    logElementsMap.put(Constants.FILTERS, filters);
	    logElementsMap.put(Constants.TIMEMILLISINUTC, new Long(new Date().getTime()));
	    logElementsMap.put(Constants.TIMESTAMP,LocalDateTime.now().toString());
	    logElementsMap.put(Constants.EVENT_THREAD, event.getThreadName());
	    logElementsMap.put(Constants.EVENT_LEVEL, event.getLevel().name());
	    //Add the application constants 
	    Map<String,Object> mapSingleLevel = new HashMap<>();
	    Map<String,List<String>> arraySingleLevelMap = new HashMap<>();
	    Map<String, Object> mapObj = null;
	    
	      if (event.getLevel().toString().equalsIgnoreCase(Constants.ERROR) && (message.startsWith("{"))) {
	    	   mapObj = new Gson().fromJson(
					  message, new TypeToken<HashMap<String, Object>>() {}.getType()
					);
	    	   
	    	   List<Object> errLstParam =  new LinkedList(Arrays.asList(new String[] {"cause","stackTrace"}));
	    	   hashMapper(mapObj,mapSingleLevel,errLstParam);
	    	   
	    	 //convert decimal value into integer
				 List<Map<String,Object>> stackTraces =  (List<Map<String, Object>>) mapSingleLevel.get("stackTrace");
				 for(Map o: stackTraces) {
					 o.put("lineNumber", Math.round((double) o.get("lineNumber")));
				 }
	    	   
	    	   logElementsMap.putAll(mapSingleLevel);
	      }
	      
	      if(message.startsWith("[")) {
	    	  //Delete [ ] from message
	    	  message = message.substring(1, message.length()-2);
	      }
	      if((message.startsWith("{"))) { 
			
 			 mapObj = new Gson().fromJson(
					  message, new TypeToken<HashMap<String, Object>>() {}.getType()
					);
 			 if(parameters != null) {
			  hashMapper(mapObj,mapSingleLevel,lstParam);
			  logElementsMap.putAll(mapSingleLevel);
 			 }
			 
		  }
	     if(mapObj != null) 
		   logElementsMap.put("msg", mapObj);
	     else 
	    	 logElementsMap.put("msg", message);
		return logElementsMap;
	}
	
	private Map<String,Object> hashMapper(final Map<String, Object> jsonMap, final Map<String, Object> singleLevelMap, 
			final List<Object> params) throws ParseException {
	    for (Map.Entry<String, Object> entry : jsonMap.entrySet()) {
	    	if(params.isEmpty()) {
	    		break;
	    	}
	        String key = entry.getKey();
	        Object value = entry.getValue();
	        if (value instanceof String) {
	        	//if got the value of key remove from list populate the map
	        	 if(params.contains(key)) {
	        		 params.remove(key);
	        		 singleLevelMap.put(key, value.toString());
	        	 }
	             
	        } else if (value instanceof Map) {
	            Map<String, Object> subMap = (Map<String, Object>)value;
	            hashMapper(subMap,singleLevelMap,params);
	        }else if(value instanceof List) {
	        	if(params.contains(key)) {
	        		params.remove(key);
	        		 singleLevelMap.put(key,value);
	        	}else {
	        	 List<Object> subList = (List<Object>)value;
	        	 for( int i=0; i<subList.size(); i++) {
	        		 if(subList.get(i) instanceof Map) {
	        			 hashMapper((Map<String,Object>)subList.get(i),singleLevelMap,params);
	        		 }
	        	 }
	          }
	        } else {
	             singleLevelMap.put(key,String.valueOf(value));
	        }

	    }
	    return singleLevelMap;
	}
}	