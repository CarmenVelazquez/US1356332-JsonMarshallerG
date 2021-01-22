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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.aa.cqe.faqla.pojo.FAQLAResponse;
import com.aa.cqe.flight.service.JsonTransformer;
import com.aa.cqe.flight.service.JsonTransformerImpl;
import com.aa.cqe.ruledistribution.FlightCrewEvent;
import com.aa.cqe.ruledistribution.FlightCrewRuleEvent;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class FAQLAResponseUnmarshlerTest {
	
	public static JsonTransformer<FAQLAResponse> faQLAResponseUnmarshler;
	FAQLAResponse faqlaResponse;
	String exampleRequest;
	
	@BeforeAll
	public static void init(){
		faQLAResponseUnmarshler = new JsonTransformerImpl<FAQLAResponse>();
	}
	
	@BeforeEach
	public void resetValue(){
		exampleRequest = null;
	}
	
	@Test
	public void faQLAResponseTest() throws JsonParseException, JsonMappingException, IOException {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/faqla/Response.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		faqlaResponse =  faQLAResponseUnmarshler.unmarshallEvent(exampleRequest, FAQLAResponse.class);
		assertAll(
				() -> assertNotNull(faqlaResponse.getEmployeeResponses()),
				() -> assertNotNull(faqlaResponse.getOptimizeRules()),
				() -> assertEquals("FAILED_CONTINUITY",faqlaResponse.getEmployeeResponses().get(0).getQlaResponses().get(0).getRuleResults().get(1).getRule())
				//() -> assertEquals("FA is already on the add SEQ 17102/2020-08-17/04",faqlaResponse.getEmployeeResponses().get(0).getQlaResponses().get(0).getRuleResults().get(0).getMessages().get(0))
		);
	}
}
