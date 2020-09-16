package com.aa.cqe.utility;

import java.io.IOException;
import java.util.Properties;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.Data;


@Data
public class PropertyReader {
	
	private static String propertyName = Constants.PROPERTYFILENAME;
	public static String applicationId;
	public static String applicationName;
	public static String componentId;
	private static PropertyReader propertyReader = null;
	
	private PropertyReader() {
		
	}
	public static PropertyReader getInstance() throws IOException {
		if(propertyReader == null) {
		  synchronized (PropertyReader.class) {
			  propertyReader = new PropertyReader();
			  fileReader();
				
		  }
		}
		return propertyReader;
	}
	
	private static void fileReader() throws IOException{
		Properties prop = new Properties();
		prop.load(PropertyReader.class.getClassLoader().getResourceAsStream(propertyName));
		applicationId = prop.getProperty(Constants.CONFIG_APPLICATION_ID);
		applicationName = prop.getProperty(Constants.CONFIG_APPLICATION_NAME);
		componentId = prop.getProperty(Constants.CONFIG_COMPONENT_ID);
	}

}
