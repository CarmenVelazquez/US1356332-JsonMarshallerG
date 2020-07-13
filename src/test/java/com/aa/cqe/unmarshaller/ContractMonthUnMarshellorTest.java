package com.aa.cqe.unmarshaller;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
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

public class ContractMonthUnMarshellorTest {

	public static JsonTransformer<List<ContractMonth>> marshaller;
	FlightEvent flightEvent;
	Flight flight;
	String exampleRequest;
	
	@BeforeAll
	public static void init(){
		marshaller = new JsonTransformerImpl<List<ContractMonth>>();
	}
	
	@BeforeEach
	public void resetValue(){
		exampleRequest = null;
	}
	
	@Test
	public void contractMonthTest() throws JsonParseException, JsonMappingException, IOException {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/contractMonth/contractMonth.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		List<ContractMonth> months = marshaller.unmarshallAnonymousJson(exampleRequest, new TypeReference<List<ContractMonth>>() {});
		
		Assertions.assertEquals(true, months.get(0) instanceof ContractMonth);
		Assertions.assertEquals(27, months.size());
	}
	
	
	@Test
	public void MQContractMonthTest() throws JsonParseException, JsonMappingException, IOException {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/contractMonth/MQContractMonth.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		List<ContractMonth> months = marshaller.unmarshallAnonymousJson(exampleRequest, new TypeReference<List<ContractMonth>>() {});
		
		Assertions.assertEquals(true, months.get(0) instanceof ContractMonth);
		Assertions.assertEquals(19, months.size());
	}
	
	
	@Test
	public void contractMonthBasedOnFlightDateTest() throws JsonParseException, JsonMappingException, IOException {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/contractMonth/contractMonth.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		List<ContractMonth> months = marshaller.unmarshallAnonymousJson(exampleRequest, new TypeReference<List<ContractMonth>>() {});
		
		String flightDate = "2020-04-01";
		LocalDate flightD = LocalDate.parse(flightDate);
		ContractMonth resultMonth = new ContractMonth();
		for(ContractMonth month : months){
			if(LocalDate.parse(month.getStartDate()).isEqual(flightD) || LocalDate.parse(month.getEndDate()).isEqual(flightD) || (LocalDate.parse(month.getStartDate()).isAfter(flightD) && LocalDate.parse(month.getEndDate()).isBefore(flightD))) {
				resultMonth = month;
				break;
			}
		}
		Assertions.assertEquals("APR2020", resultMonth.getContractMonthKey().getContractMonth());
	}
}
