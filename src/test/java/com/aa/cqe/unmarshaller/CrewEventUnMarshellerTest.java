package com.aa.cqe.unmarshaller;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aa.cqe.crew.pojo.FlightCrewRuleEvent;
import com.aa.cqe.flight.service.JsonTransformer;
import com.aa.cqe.flight.service.JsonTransformerImpl;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;

public class CrewEventUnMarshellerTest {
	public static JsonTransformer<List<FlightCrewRuleEvent>> marshaller;
	String exampleRequest;
	
	@BeforeAll
	public static void init(){
		marshaller = new JsonTransformerImpl<List<FlightCrewRuleEvent>>();
	}
	
	@BeforeEach
	public void resetValue(){
		exampleRequest = null;
	}
	
	@Test
	public void FlightCrewRuleEventTest() throws JsonParseException, JsonMappingException, IOException {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/crewRuleEvent/crew.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		List<FlightCrewRuleEvent> events = marshaller.unmarshallAnonymousJson(exampleRequest, new TypeReference<List<FlightCrewRuleEvent>>() {});
		
		assertAll(

				() -> assertEquals("408", events.get(0).getCrew().getFltKey().getFlightNumber()),
				() -> assertEquals("CYCLE", events.get(0).getEventType()),
				() -> assertTrue(events.get(0) instanceof FlightCrewRuleEvent)

		);
	}
}
