package com.aa.cqe.logging;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.logging.log4j.core.LogEvent;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.aa.cqe.utility.Constants;
import com.aa.cqe.utility.PropertyReader;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;



public class FormatMessage {
	
//	private String _applicationId="CQEEngine";
//	private String _applicationOrServiceName="CQEEngine";
	private String _filters="Analytics";
//	private String _componentid="Consumer";
	private LogElementsBuilder logElementsBuilder;
	private PropertyReader propertyReader = null;
	
	public String getFormattedMessage(LogEvent event) throws ParseException, IOException {
		
		String regex =  "(\\r\\n|\\t|\\\\|\\u003d|\\u0027)";
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
	    ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("UTC"));
	    propertyReader = PropertyReader.getInstance();
	    Object[] parameters = event.getMessage().getParameters();
	    String formatedString = event.getMessage().getFormattedMessage();
	    StringBuilder sb = new StringBuilder(formatedString);
	    String message = sb.toString().replaceAll(regex, "");
	
	    logElementsBuilder = new LogElementsBuilder(propertyReader.applicationId, propertyReader.applicationName,
	    		propertyReader.componentId, _filters);
	    Map<String,Object> mapSingleLevel = new HashMap<>();
	    Map<String,List<String>> arraySingleLevelMap = new HashMap<>();
	    Map<String, Object> mapObj = null;
	    
	      if (event.getLevel().toString().equalsIgnoreCase(Constants.ERROR)) {
	    	   mapObj = new Gson().fromJson(
					  message, new TypeToken<HashMap<String, Object>>() {}.getType()
					);
	    	   List<Object> lstParam =  new LinkedList(Arrays.asList(new String[] {"cause","stackTrace"}));
	    	   hashMapper(mapObj,mapSingleLevel,lstParam);
	    	   logElementsBuilder.optionalFields()
				.fields(mapSingleLevel,lstParam)
					.build();
	      }
		
		  if((message.startsWith("{") || message.startsWith("[")) && parameters != null) { 
			 List<Object> lstParam =  new LinkedList(Arrays.asList(parameters));
			 
			
			/*
			 * if (message.startsWith("[")) { List<?> typeList = new
			 * Gson().fromJson(message, new TypeToken<List<Object>>() { }.getType());
			 * Map<String, Object> mapObj = new HashMap<>(); mapObj.put("array", typeList);
			 * hashMapperOfArray(mapObj, arraySingleLevelMap);
			 * 
			 * }else {
			 */
			 
			mapObj = new Gson().fromJson(
					  message, new TypeToken<HashMap<String, Object>>() {}.getType()
					);
			 
			 hashMapper(mapObj,mapSingleLevel,lstParam);
			 //Map<String, String> mapOptional = filterByKeys(mapSingleLevel,lstParam);
			 logElementsBuilder.optionalFields()
			 						.fields(mapSingleLevel,lstParam)
								.build();
		  }
		 
	    Message msg =  new Message(message);
	    
		LogElements logElements = logElementsBuilder
									.level()
										.logLevel(event.getLevel().toString())
										.threadName(event.getThreadName())
										.className(event.getLoggerName())
									.time()
										.timeLocal(fmt.format(LocalDateTime.now()))
										.timeUTC(fmt.format(zdt))
									.message()
										.msg(msg)
									.build();
		
		return logElements.toString() + "\n";
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
	        		 singleLevelMap.put(key,(String) value);
	        	 }
	             
	        } else if (value instanceof Map) {
	            Map<String, Object> subMap = (Map<String, Object>)value;
	            hashMapper(subMap,singleLevelMap,params);
	        }else if(value instanceof List) {
	        	if(singleLevelMap.containsKey(key)) {
	        		
	        	}
	        	 List<Object> subList = (List<Object>)value;
	        	 for( int i=0; i<subList.size(); i++) {
	        		 if(subList.get(i) instanceof Map) {
	        			 hashMapper((Map<String,Object>)subList.get(i),singleLevelMap,params);
	        		 }
	        	 }
	        } else {
	             singleLevelMap.put(key,String.valueOf(value));
	        }

	    }
	    return singleLevelMap;
	}
	
	public static Map<String,List<String>> hashMapperOfArray(final Map<String, Object> jsonArrayMap, final Map<String,List<String>> arraySingleLevelMap){
		 for (Map.Entry<String, Object> entry : jsonArrayMap.entrySet()) {
		        String key = entry.getKey();
		        Object value = entry.getValue();
		        if (value instanceof String) {
		        	if(arraySingleLevelMap.containsKey(key)) {
		        		List<String> lst = arraySingleLevelMap.get(key);
		        		lst.add((String) value);
		        	}else {
		        		List<String> newLst = new ArrayList<>();
		        		newLst.add((String) value);
		        		arraySingleLevelMap.put(key, newLst);
		        	}
		        } else if (value instanceof Map) {
		            Map<String, Object> subMap = (Map<String, Object>)value;
		            hashMapperOfArray(subMap,arraySingleLevelMap);
		        } else if(value instanceof List) {
		        	 List<Object> subList = (List<Object>)value;
		        	 for( int i=0; i<subList.size(); i++) {
		        		 if(subList.get(i) instanceof Map) {
		        			 hashMapperOfArray((Map<String,Object>)subList.get(i),arraySingleLevelMap);
		        		 }
		        	 }
		        	
		        	
		        }

		    }
		return arraySingleLevelMap;

	}
	
	
	
	public static Map<String, String> filterByKeys(final Map<String, String> map, final List<Object> lstKeys) {
	    final Map<String, String> newMap = new HashMap<>();
		/*
		 * iterator.forEach(key -> Optional.ofNullable(map.get(key)) .ifPresent(value ->
		 * newMap.put(key, value)));
		 */
	    lstKeys.forEach(key -> Optional.ofNullable(map.get(key)).ifPresent(value->newMap.put((String) key, value)));
	    
	    return newMap;
	}
	
}	