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

import com.aa.cqe.flight.service.JsonTransformer;
import com.aa.cqe.flight.service.JsonTransformerImpl;
import com.aa.cqe.ruledistribution.FlightCrewEvent;
import com.aa.cqe.ruledistribution.FlightCrewRuleEvent;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class RuleDistributorUnmarshlerTest {
	
	public static JsonTransformer<FlightCrewEvent> crewEventMarshaller;
	public static JsonTransformer<FlightCrewRuleEvent> crewRuleEventMarshaller;
	FlightCrewEvent flightCrewEvent;
	FlightCrewRuleEvent flightCrewRuleEvent;
	String exampleRequest;
	
	@BeforeAll
	public static void init(){
		crewEventMarshaller = new JsonTransformerImpl<FlightCrewEvent>();
		crewRuleEventMarshaller = new JsonTransformerImpl<FlightCrewRuleEvent>();
	}
	
	@BeforeEach
	public void resetValue(){
		exampleRequest = null;
	}
	
	@Test
	public void flightCrewEventTest() throws JsonParseException, JsonMappingException, IOException {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/rules/ETA.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		flightCrewEvent =  crewEventMarshaller.unmarshallEvent(exampleRequest, FlightCrewEvent.class);
		
		assertAll(
				() -> assertNotNull(flightCrewEvent.getCrew()),
				() -> assertEquals("408",flightCrewEvent.getCrew().getFltKey().getFlightNumber()),
				() -> assertEquals(64629,flightCrewEvent.getCrew().getSequenceKey().getSequenceNumber()),
				() -> assertEquals("ETA", flightCrewEvent.getEventType())
		);
	}
	
	@Test
	public void flightCrewRuleEventTest() throws JsonParseException, JsonMappingException, IOException {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/rules/OnDutyRule.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		flightCrewRuleEvent =  crewRuleEventMarshaller.unmarshallEvent(exampleRequest, FlightCrewRuleEvent.class);
		
		assertAll(
				() -> assertNotNull(flightCrewRuleEvent.getCrew()),
				() -> assertEquals("ON_DUTY_ALL_NIGHT_EVENT", flightCrewRuleEvent.getRuleName()),
				() -> assertEquals("408",flightCrewRuleEvent.getCrew().getFltKey().getFlightNumber()),
				() -> assertEquals(64629,flightCrewRuleEvent.getCrew().getSequenceKey().getSequenceNumber()),
				() -> assertEquals("ETA", flightCrewRuleEvent.getEventType())
		);
	}
}
