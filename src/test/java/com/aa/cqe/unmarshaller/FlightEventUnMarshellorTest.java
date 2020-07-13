package com.aa.cqe.unmarshaller;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aa.cqe.contractmonth.pojo.ContractMonth;
import com.aa.cqe.flight.pojo.Flight;
import com.aa.cqe.flight.pojo.FlightEvent;
import com.aa.cqe.flight.service.JsonTransformer;
import com.aa.cqe.flight.service.JsonTransformerImpl;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FlightEventUnMarshellorTest {

	public static JsonTransformer<FlightEvent> marshaller;
	FlightEvent flightEvent;
	Flight flight;
	String exampleRequest;
	
	@BeforeAll
	public static void init(){
		marshaller = new JsonTransformerImpl<FlightEvent>();
	}
	
	@BeforeEach
	public void resetValue(){
		flightEvent = null;
		flight = null;
		exampleRequest = null;
	}
	
	@Test
	public void inEventTest() {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/in.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		flightEvent =  marshaller.unmarshallEvent(exampleRequest, FlightEvent.class);
		flight = flightEvent.getFlight();
		
		Assertions.assertEquals("IN", flight.getEvent());
		Assertions.assertEquals("I", flight.getLeg().getStatus().getArr());
		Assertions.assertEquals("F", flight.getLeg().getStatus().getDep());
		Assertions.assertEquals("Arrived at gate", flight.getLeg().getStatus().getPaxStatus());
		Assertions.assertEquals(" ", flight.getLeg().getStatus().getLeg());
	}
	
	
	@Test
	public void outEventTest() {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/out.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		flightEvent = marshaller.unmarshallEvent(exampleRequest, FlightEvent.class);
		flight = flightEvent.getFlight();
		
		Assertions.assertEquals("OUT", flight.getEvent());
		Assertions.assertEquals("O", flight.getLeg().getStatus().getDep());
		Assertions.assertEquals("DVR", flight.getDelayCodes().getThru().get(0).getCode());
		Assertions.assertEquals("PT8M", flight.getDelayCodes().getThru().get(0).getTime());
	}
	
	@Test
	public void createEventTest() {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/create.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		flightEvent =  marshaller.unmarshallEvent(exampleRequest, FlightEvent.class);
		flight = flightEvent.getFlight();
		
		Assertions.assertEquals("CREATE", flight.getEvent());
		Assertions.assertEquals("9222", flight.getKey().getFltNum());
		Assertions.assertEquals("AA", flight.getLeg().getCodeShareInfo().getMarketCode());
		Assertions.assertEquals("S", flight.getLeg().getStatus().getDep());
	}
	
	@Test
	public void cancelEventTest() {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/cancel.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		flightEvent =  marshaller.unmarshallEvent(exampleRequest, FlightEvent.class);
		flight = flightEvent.getFlight();
		
		Assertions.assertEquals("CANCEL", flight.getEvent());
		Assertions.assertEquals("9284", flight.getKey().getFltNum());
		Assertions.assertEquals("Canceled", flight.getLeg().getStatus().getPaxStatus());
		Assertions.assertEquals("XAT", flight.getLeg().getReason().getCode());
		Assertions.assertEquals("ADD", flight.getLeg().getReason().getInformation());
	}
	
	@Test
	public void diversionEventTest() {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/diversion.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		flightEvent = marshaller.unmarshallEvent(exampleRequest, FlightEvent.class);
		flight = flightEvent.getFlight();
		
		Assertions.assertEquals("DIVERSION", flight.getEvent());
		Assertions.assertEquals("9230", flight.getKey().getFltNum());
		Assertions.assertEquals("9230", flight.getLeg().getLinkage().getNextLegFltNum());
		Assertions.assertEquals("Diverted: JFK", flight.getLeg().getStatus().getPaxStatus());
		Assertions.assertEquals("AWD", flight.getLeg().getReason().getCode());
	}
	
	@Test
	public void continuationEventTest() {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/continuation.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		flightEvent =  marshaller.unmarshallEvent(exampleRequest, FlightEvent.class);
		flight = flightEvent.getFlight();
		
		Assertions.assertEquals("CONTINUATION", flight.getEvent());
		Assertions.assertEquals("9230", flight.getKey().getFltNum());
		Assertions.assertEquals("LHR", flight.getLeg().getStations().getArr());
		Assertions.assertEquals("0", flight.getLeg().getStations().getDupArrStaNum());
		Assertions.assertEquals("7879", flight.getLeg().getEquipment().getSkdEquipType());
	}
	
	@Test
	public void eqsubEventTest() {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/eqsub.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		flightEvent =  marshaller.unmarshallEvent(exampleRequest, FlightEvent.class);
		flight = flightEvent.getFlight();
		
		Assertions.assertEquals("EQSUB", flight.getEvent());
		Assertions.assertEquals("0810", flight.getKey().getFltNum());
		Assertions.assertEquals("N", flight.getLUSInd());
	}
	
	@Test
	public void rtdEventTest() {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/rtd.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		flightEvent =  marshaller.unmarshallEvent(exampleRequest, FlightEvent.class);
		flight = flightEvent.getFlight();
		
		Assertions.assertEquals("RTD", flight.getEvent());
		Assertions.assertEquals("1469", flight.getKey().getFltNum());
		Assertions.assertEquals("2020-05-18", flight.getLeg().getLinkage().getNextLegOrgDate());
		Assertions.assertEquals("738K", flight.getLeg().getEquipment().getAssignedEquipType());
		Assertions.assertEquals("A14", flight.getLeg().getDepartureArrival().getDepGate());
	}
	
	@Test
	public void delaymsgEventTest() {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/delaymsg.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		flightEvent =  marshaller.unmarshallEvent(exampleRequest, FlightEvent.class);
		flight = flightEvent.getFlight();
		
		Assertions.assertEquals("DELAYMSG", flight.getEvent());
		Assertions.assertEquals("1829", flight.getKey().getFltNum());
		Assertions.assertEquals("SYR", flight.getLeg().getStations().getArr());
		Assertions.assertEquals("SD", flight.getDelayCodes().getLocal().get(0).getCode());
		Assertions.assertEquals("I", flight.getLeg().getStatus().getArr());
	}
	
	@Test
	public void deskEventTest() {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/desk.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		flightEvent =  marshaller.unmarshallEvent(exampleRequest, FlightEvent.class);
		flight = flightEvent.getFlight();
		
		Assertions.assertEquals("DESK", flight.getEvent());
		Assertions.assertEquals("2927", flight.getKey().getFltNum());
		Assertions.assertEquals("CLT", flight.getLeg().getStations().getArr());
		Assertions.assertEquals("FD18", flight.getLeg().getPlanners().getDispDesk());
		Assertions.assertEquals("7118", flight.getLeg().getPlanners().getDispPhone());
	}
	
	@Test
	public void loadplanEventTest() {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/loadplan.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		flightEvent =  marshaller.unmarshallEvent(exampleRequest, FlightEvent.class);
		flight = flightEvent.getFlight();
		
		Assertions.assertEquals("LOADPLAN", flight.getEvent());
		Assertions.assertEquals("0793", flight.getKey().getFltNum());
		Assertions.assertEquals(14770, flight.getLeg().getPayloadAndWeights().getPayload());
		Assertions.assertEquals("P", flight.getLeg().getPayloadAndWeights().getLoadStatus());
		Assertions.assertEquals(110699, flight.getLeg().getPayloadAndWeights().getDryOperatingWeight());
	}
	
	@Test
	public void psgrloadEventTest() {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/psgrload.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		flightEvent =  marshaller.unmarshallEvent(exampleRequest, FlightEvent.class);
		flight = flightEvent.getFlight();
		
		Assertions.assertEquals("PSGRLOAD", flight.getEvent());
		Assertions.assertEquals("2907", flight.getKey().getFltNum());
		Assertions.assertEquals("4", flight.getLoadPlanPaxCounts().getCounts().getPaxDataItems());
		Assertions.assertEquals("N", flight.getLoadPlanPaxCounts().getThruPaxUpdateInd());
		Assertions.assertEquals(0, flight.getLoadPlanPaxCounts().getXRider().getLocalF());
	}
	
	@Test
	public void cargoEventTest() {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/cargo.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		flightEvent =  marshaller.unmarshallEvent(exampleRequest, FlightEvent.class);
		flight = flightEvent.getFlight();
		
		Assertions.assertEquals("CARGO", flight.getEvent());
		Assertions.assertEquals(2, flight.getCargoItems().getCargoItem().size());
	}
	
	@Test
	public void connectionEventTest() {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/connection.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		flightEvent =  marshaller.unmarshallEvent(exampleRequest, FlightEvent.class);
		flight = flightEvent.getFlight();
		
		Assertions.assertEquals("PSGRLOAD", flight.getEvent());
		Assertions.assertEquals(39, flight.getConnection().size());
		Assertions.assertEquals("S", flight.getLeg().getStatus().getArr());
	}
	
	@Test
	public void stubstaEventTest() {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/stubsta.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		flightEvent =  marshaller.unmarshallEvent(exampleRequest, FlightEvent.class);
		flight = flightEvent.getFlight();
		
		Assertions.assertEquals("STUBSTA", flight.getEvent());
		Assertions.assertEquals("2424", flight.getKey().getFltNum());
		Assertions.assertEquals("LAX", flight.getLeg().getStations().getArr());
		Assertions.assertEquals("321S", flight.getLeg().getEquipment().getAssignedEquipType());
	}
	
	@Test
	public void emptyJsonTest() {
		exampleRequest = "  ";
		flightEvent =  marshaller.unmarshallEvent(exampleRequest, FlightEvent.class);
		Assertions.assertNull(flightEvent);
	}
	
	@Test
	public void nullJsonTest() {
		flightEvent =  marshaller.unmarshallEvent(exampleRequest, FlightEvent.class);
		Assertions.assertNull(flightEvent);
	}
}
