package com.aa.cqe.logging;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Optional;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.ThreadContext.ContextStack;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.impl.ThrowableProxy;
import org.apache.logging.log4j.core.time.Instant;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.util.ReadOnlyStringMap;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.lang.Nullable;

import com.google.gson.GsonBuilder;

public class FormatMessageTest {
	private String exampleRequest;
	private FormatMapMessages formatMessage;
	@BeforeEach
	public void setUp() {
		
	}
	@Test
	public void getFormattedMessageTest() throws ParseException, IOException {
		exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/out.json"), StandardCharsets.UTF_8);
		String[] params = new String[] {"filter:SRE,SECURITY", "event","trackingID"};
		formatMessage = new FormatMapMessages();
		Map<String,Object> fmtMessage = formatMessage.getFormattedMessage(getEvent("testThread",1l,Level.INFO,exampleRequest, params));
		System.out.println("Messages : " +  new GsonBuilder().create().toJson(fmtMessage));
		assertEquals(fmtMessage.get("event"), "OUT");
		assertEquals(fmtMessage.get("trackingID"),"414d512046484d5154433120202020205eb5e31124104fd1");
		assertNotNull(fmtMessage.get("msg"));
	}
	
	@Test
	public void getFormattedMessageWithoutFilterTest() throws ParseException, IOException {
		exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/out.json"), StandardCharsets.UTF_8);
		String[] params = new String[] {"fltNum","trackingID"};
		formatMessage = new FormatMapMessages();
		Map<String,Object> fmtMessage = formatMessage.getFormattedMessage(getEvent("testThread",1l,Level.INFO,exampleRequest, params));
		System.out.println("Messages : " +  new GsonBuilder().create().toJson(fmtMessage));
		assertEquals(fmtMessage.get("fltNum"),"9231");
		assertNotNull(fmtMessage.get("msg"));
	}
	
	@Test
	public void getFormattedErrorMessageTest() throws IOException, ParseException {
		exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/errors/errorMsg.json"), StandardCharsets.UTF_8);
		formatMessage = new FormatMapMessages();
		Map<String,Object> fmtMessage = formatMessage.getFormattedMessage(getEvent("testErrorThread",2l,Level.ERROR,exampleRequest,null));
		System.out.println("Messages : " +  new GsonBuilder().create().toJson(fmtMessage));
		//assertEquals(fmtMessage.get("cause"),", CCS API Throwing Error because Duplicate method for exception");
		assertNotNull(fmtMessage.get("stackTrace"));
	}
	
	@Test
	public void getFormattedErrorMessageWithFilterTest() throws IOException, ParseException {
		exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/errors/errorMsg.json"), StandardCharsets.UTF_8);
		formatMessage = new FormatMapMessages();
		Map<String,Object> fmtMessage = formatMessage.getFormattedMessage(getEvent("testErrorThread",2l,Level.ERROR,exampleRequest,new String[] {"filter:SRE"}));
		System.out.println("Messages : " +  new GsonBuilder().create().toJson(fmtMessage));
		//assertEquals(fmtMessage.get("cause"),", CCS API Throwing Error because Duplicate method for exception");
		assertNotNull(fmtMessage.get("stackTrace"));
	}
	
	@Test
	public void getFormattedSimpleMessageTest() throws IOException, ParseException {
		formatMessage = new FormatMapMessages();
		String message = "Messages : This is the Simmple Message" + " Just to Test";
		//assertEquals(fmtMessage.get("cause"),", CCS API Throwing Error because Duplicate method for exception");
		Map<String,Object> fmtMessage = formatMessage.getFormattedMessage(getEvent("testThread",2l,Level.INFO,message,new String[] {"filter:SRE"}));
		System.out.println("Messages : " +  new GsonBuilder().create().toJson(fmtMessage));
	}
	
	@Test
	public void getFormattedSimpleMessageWithEqualSighTest() throws IOException, ParseException {
		formatMessage = new FormatMapMessages();
		String message = "Messages : This is the Simple Message = " + "12";
		//assertEquals(fmtMessage.get("cause"),", CCS API Throwing Error because Duplicate method for exception");
		Map<String,Object> fmtMessage = formatMessage.getFormattedMessage(getEvent("testThread",2l,Level.INFO,message,new String[] {"filter:SRE"}));
		System.out.println("Messages : " +  new GsonBuilder().create().toJson(fmtMessage));
	}
	
	@Test
	public void getFormattedSimpleMessageWithSimpleErrorTest() throws IOException, ParseException {
		formatMessage = new FormatMapMessages();
		String message = "Messages : This is the Simple Error Message = " + "12";
		//assertEquals(fmtMessage.get("cause"),", CCS API Throwing Error because Duplicate method for exception");
		Map<String,Object> fmtMessage = formatMessage.getFormattedMessage(getEvent("testErrorThread",2l,Level.ERROR,message,new String[] {"filter:SRE"}));
		System.out.println("Messages : " +  new GsonBuilder().create().toJson(fmtMessage));
	}
	
	@Test
	public void getFormattedJsonWithoutParamTest() throws IOException, ParseException {
		exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/out.json"), StandardCharsets.UTF_8);
		formatMessage = new FormatMapMessages();
		//assertEquals(fmtMessage.get("cause"),", CCS API Throwing Error because Duplicate method for exception");
		Map<String,Object> fmtMessage = formatMessage.getFormattedMessage(getEvent("testThread",2l,Level.INFO,exampleRequest,null));
		System.out.println("Messages : " +  new GsonBuilder().create().toJson(fmtMessage));
	}
	
	@Test
	public void getFormattedJsonArrayTest() throws IOException, ParseException {
		exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/contractMonth/contractMonth.json"), StandardCharsets.UTF_8);
		//exampleRequest = exampleRequest.substring(1,exampleRequest.length()-2);
		formatMessage = new FormatMapMessages();
		//assertEquals(fmtMessage.get("cause"),", CCS API Throwing Error because Duplicate method for exception");
		Map<String,Object> fmtMessage = formatMessage.getFormattedMessage(getEvent("testThread",2l,Level.INFO,exampleRequest,null));
		System.out.println("Messages : " +  new GsonBuilder().create().toJson(fmtMessage));
	}
	
	@Test
	public void getFormattedJsonWithOtherTypes() throws IOException, ParseException {
		exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/rules/Result.json"), StandardCharsets.UTF_8);
		//exampleRequest = exampleRequest.substring(1,exampleRequest.length()-2);
		formatMessage = new FormatMapMessages();
		//assertEquals(fmtMessage.get("cause"),", CCS API Throwing Error because Duplicate method for exception");
		Map<String,Object> fmtMessage = formatMessage.getFormattedMessage(getEvent("testThread",2l,Level.INFO,exampleRequest,new String[] {"trackingID"}));
		assertNotNull(fmtMessage.get("trackingID"));
		assertEquals(fmtMessage.get("trackingID"), "7431305481141112229164");
		System.out.println("Messages : " +  new GsonBuilder().create().toJson(fmtMessage));
	}
	
	private LogEvent getEvent(String threadName, long threadId, Level level, String message, @Nullable String[] parameters) {
		return new LogEvent() {
			
			@Override
			public LogEvent toImmutable() {return null;}
			
			@Override
			public void setIncludeLocation(boolean locationRequired) {}
			
			@Override
			public void setEndOfBatch(boolean endOfBatch) {	}
			
			@Override
			public boolean isIncludeLocation() {
				return false;
			}
			
			@Override
			public boolean isEndOfBatch() {
				return false;
			}
			
			@Override
			public long getTimeMillis() {
				return 0;
			}
			
			@Override
			public ThrowableProxy getThrownProxy() {
				return null;
			}
			
			@Override
			public Throwable getThrown() {
				return null;
			}
			
			@Override
			public int getThreadPriority() {
				return 0;
			}
			
			@Override
			public String getThreadName() {
				return threadName;
			}
			
			@Override
			public long getThreadId() {
				return threadId;
			}
			
			@Override
			public StackTraceElement getSource() {
				return null;
			}
			
			@Override
			public long getNanoTime() {
				return 0;
			}
			
			@Override
			public Message getMessage() {
				
				return new Message() {
					
					@Override
					public Throwable getThrowable() {
						return null;
					}
					
					@Override
					public Object[] getParameters() {
						return parameters;
					}
					
					@Override
					public String getFormattedMessage() {
						return message;
					}
					
					@Override
					public String getFormat() {
						return null;
					}
				};
			}
			
			@Override
			public Marker getMarker() {
				return null;
			}
			
			@Override
			public String getLoggerName() {
				return null;
			}
			
			@Override
			public String getLoggerFqcn() {
				return null;
			}
			
			@Override
			public Level getLevel() {
				return level;
			}
			
			@Override
			public Instant getInstant() {
				return null;
			}
			
			@Override
			public ContextStack getContextStack() {
				return null;
			}
			
			@Override
			public Map<String, String> getContextMap() {
				return null;
			}
			
			@Override
			public ReadOnlyStringMap getContextData() {
				return null;
			}
		};
	}
	
}
