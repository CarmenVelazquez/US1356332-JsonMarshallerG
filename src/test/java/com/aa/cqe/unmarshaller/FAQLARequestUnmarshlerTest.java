package com.aa.cqe.unmarshaller;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aa.cqe.faqla.pojo.FAQLARequest;
import com.aa.cqe.faqla.pojo.FAQLAResponse;
import com.aa.cqe.flight.service.JsonTransformer;
import com.aa.cqe.flight.service.JsonTransformerImpl;
import com.aa.cqe.ruledistribution.FlightCrewEvent;
import com.aa.cqe.ruledistribution.FlightCrewRuleEvent;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class FAQLARequestUnmarshlerTest {
	
	public static JsonTransformer<FAQLARequest> faQLAResponseUnmarshler;
	FAQLARequest faqlaRequest;
	String exampleRequest;
	
	@BeforeAll
	public static void init(){
		faQLAResponseUnmarshler = new JsonTransformerImpl<FAQLARequest>();
	}
	
	@BeforeEach
	public void resetValue(){
		exampleRequest = null;
	}
	
	@Test
	public void faQLAResponseTest() throws JsonParseException, JsonMappingException, IOException {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/faqla/Request.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		faqlaRequest =  faQLAResponseUnmarshler.unmarshallEvent(exampleRequest, FAQLARequest.class);
		assertAll(
				() -> assertNotNull(faqlaRequest.getEmployees()),
				() -> assertEquals("422953",faqlaRequest.getEmployees().get(0).getEmployeeID()),
				() -> assertEquals("AA",faqlaRequest.getEmployees().get(0).getAirlineCode())
		);
	}
}
