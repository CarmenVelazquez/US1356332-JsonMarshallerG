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
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import org.apache.logging.log4j.core.LogEvent;
import org.json.simple.parser.ParseException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.util.StringUtils;

import com.aa.cqe.utility.Constants;
import com.aa.cqe.utility.PropertyReader;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;



public class FormatMapMessages {
	
	private PropertyReader propertyReader = null;
	public static final TimeZone UTC = TimeZone.getTimeZone("UTC");
	
	@Async
	public Future<Map<String,Object>> getFormattedMessage(LogEvent event) throws ParseException, IOException, InterruptedException {
		
		Map<String,Object> mapSingleLevel = new HashMap<>();
	    Map<String, Object> mapObj = null;
		
		String regex =  "(\\r\\n|\\t|\\\\|\\u003d|\\u0027)";
		//DateTimeFormatter fmt = DateTimeFormatter.ofPattern(Constants.TIME_FORMAT);
	    //ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.now(), ZoneId.of(Constants.UTC));
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
	    filters.add(Constants.ANALYTICS);
	    if(lstParam != null && lstParam.size()!=0) {
	    	
	    	//if first parameter is a class
		    if(lstParam.get(0) instanceof Object && !(lstParam.get(0) instanceof String)) {
		    	logElementsMap.put(Constants.TITLE, message);
		    	try {
		    	message = new Gson().toJson(lstParam.get(0)).toString();
		    	}catch(Exception ex) {
		    		//swallow the exception so that if it's object but not in json format it will behave like simple message
		    		message = lstParam.get(0).toString();
		    	}
		    	lstParam.remove(0);
		    }
	    	
			if(lstParam.size()>0 && lstParam.get(0)!=null) {
		    	//if first parameter is json String
			     if( lstParam.get(0).toString().startsWith("{")) {
			    	logElementsMap.put(Constants.TITLE, message);
			    	message = lstParam.get(0).toString();
			    	lstParam.remove(0);
			    	
			    }else if(lstParam.get(0).toString().startsWith("[")) {
			    	logElementsMap.put(Constants.TITLE, message);
			    	//Delete [ ] from message
			    	message = lstParam.get(0).toString();
			    	lstParam.remove(0);
			    }		 
		    	
		    		String filterParam = lstParam.get(0).toString();
				    String[] filterStr = filterParam.split(":");
				    
				    if(filterStr[0].equalsIgnoreCase(Constants.FILTER) && !StringUtils.isEmpty(filterStr[1])) {
				    	lstParam.remove(0);
				    	String[] filterName = filterStr[1].split(",");
				    	for(int i=0;i < filterName.length; i++) {
				    		filters.add(filterName[i]);
				    	}
				    }
		    	
				    //String with key value for logs
				    List<Object> mapList = lstParam.stream().filter(x->x.toString().contains(":")).collect(Collectors.toList());
				    for(Object pair : mapList) {
				    	String strPair = pair.toString();
				    	int index = strPair.indexOf(':');
				    	String key = strPair.substring(0,index);
				    	String value = strPair.substring(index+1, strPair.length());
				    	mapSingleLevel.put(key, value);
				    	lstParam.remove(pair);
				    }
		    }
	    }
	    //Add the application constants 
	    logElementsMap.put(Constants.FILTERS, filters);
	    logElementsMap.put(Constants.TIMEMILLISINUTC, new Long(new Date().getTime()));
	    logElementsMap.put(Constants.TIMESTAMP,LocalDateTime.now().toString());
	    logElementsMap.put(Constants.EVENT_THREAD, event.getThreadName());
	    logElementsMap.put(Constants.EVENT_LEVEL, event.getLevel().name());
	    logElementsMap.put(Constants.CLASSNAME, event.getLoggerName());
	   
	    
	    
	      if (event.getLevel().toString().equalsIgnoreCase(Constants.ERROR) && (message.startsWith("{"))) {
	    	   mapObj = new Gson().fromJson(
					  message, new TypeToken<HashMap<String, Object>>() {}.getType()
					);
	    	   
	    	   List<Object> errLstParam =  new LinkedList<>(Arrays.asList(new String[] {"cause","stackTrace"}));
	    	   hashMapper(mapObj,mapSingleLevel,errLstParam);
	    	   
	    	 //convert decimal value into integer
				 List<Map<String,Object>> stackTraces =  (List<Map<String, Object>>) mapSingleLevel.get("stackTrace");
				 for(Map o: stackTraces) {
					 o.put("lineNumber", Math.round((double) o.get("lineNumber")));
				 }
			   logElementsMap.put(Constants.MESSAGE, mapObj);
	    	   logElementsMap.putAll(mapSingleLevel);
	      }else {
	      
		      if(message.startsWith("[")) {
		    	 List<?> lstObject = null;
		    	 try {
		    			 lstObject = new Gson().fromJson(
						  message, new TypeToken<List<Object>>() {}.getType());
		    	 }catch(Exception ex) {
		    		 //swallow the exception 
		    	 }
		    	 logElementsMap.putAll(mapSingleLevel);
		    	 if(lstObject != null)
		    		 logElementsMap.put(Constants.MESSAGE, lstObject);
		    	 else
		    		 logElementsMap.put(Constants.MESSAGE, message);
		    	 
		      }else {
		      // message with label followed by json string 
		      if(!message.startsWith("{") && message.contains("{") && message.endsWith("}")) {
		    	  int firstCounter =  message.indexOf('{');
		    	  int lastCounter = message.lastIndexOf('}');
		    	  String label = message.substring(0, firstCounter);
		    	  logElementsMap.put(Constants.TITLE, label);
		    	  message = message.substring(firstCounter,lastCounter+1);
		      }
		      if((message.startsWith("{"))) { 
				
	 			 mapObj = new Gson().fromJson(
						  message, new TypeToken<HashMap<String, Object>>() {}.getType()
						);
	 			 if(parameters != null && lstParam.size() != 0) {
				  hashMapper(mapObj,mapSingleLevel,lstParam);
	 			 }
	 			logElementsMap.putAll(mapSingleLevel);
			  }
		     if(mapObj != null) 
		    	 logElementsMap.put(Constants.MESSAGE, mapObj);
		     else 
		    	 logElementsMap.put(Constants.MESSAGE, message);
		    }
	  }
	return new AsyncResult<Map<String,Object>>(logElementsMap);
   }
	
	private Map<String,Object> hashMapper(final Map<String, Object> jsonMap, final Map<String, Object> singleLevelMap, 
			final List<Object> params) throws ParseException {
	    for (Map.Entry<String, Object> entry : jsonMap.entrySet()) {
	    	if(params.isEmpty()) {
	    		break;
	    	}
	        String key = entry.getKey();
	        Object value = entry.getValue();
	        if (value instanceof String || value instanceof Boolean || value instanceof Double) {
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
	        }

	    }
	    return singleLevelMap;
	}

	
}	