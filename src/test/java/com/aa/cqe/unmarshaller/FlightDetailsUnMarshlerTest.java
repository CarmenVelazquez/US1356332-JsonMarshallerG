package com.aa.cqe.unmarshaller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aa.cqe.ccs.pojo.CrewDetails;
import com.aa.cqe.contractmonth.pojo.ContractMonth;
import com.aa.cqe.flight.service.JsonTransformer;
import com.aa.cqe.flight.service.JsonTransformerImpl;
import com.fasterxml.jackson.core.type.TypeReference;

public class FlightDetailsUnMarshlerTest {
	
	public static JsonTransformer<List<CrewDetails>> marshaller;
	String exampleRequest;
	
	@BeforeAll
	public static void init() {
		marshaller = new JsonTransformerImpl<List<CrewDetails>>();
	}
	
	@BeforeEach
	public void setup() {
		exampleRequest = null;
	}
	
	@Test
	public void flightDetailsUnmarshlerTest() {
		try {
			//exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/css/flightDetails.json"), StandardCharsets.UTF_8);
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/css/flightDetails2.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		List<CrewDetails> flightDetails = marshaller.unmarshallAnonymousJson(exampleRequest, new TypeReference<List<CrewDetails>>() {});
		
		assertEquals(true, flightDetails.get(0) instanceof CrewDetails);
		
	}

}
