package com.aa.cqe.logging;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

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

import com.google.gson.GsonBuilder;

public class FormatMessageTest {
	private String exampleRequest;
	private FormatMapMessages formatMessage;
	private LogEvent event ;
	@BeforeEach
	public void setUp() {
		
	}
	@Test
	public void getFormattedMessageTest() throws ParseException, IOException {
		try {
			exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/out.json"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] params = new String[] {"event","trackingID"};
		formatMessage = new FormatMapMessages();
		Map<String,Object> fmtMessage = formatMessage.getFormattedMessage(getEvent("testThread",1l,Level.INFO,exampleRequest,params));
		String jsonStr = new GsonBuilder().create().toJson(fmtMessage);
		System.out.println("Formatted Message : " + jsonStr);
	}
	
	private LogEvent getEvent(String threadName, long threadId, Level level, String message, String[] parameters) {
		return new LogEvent() {
			
			@Override
			public LogEvent toImmutable() {return null;}
			
			@Override
			public void setIncludeLocation(boolean locationRequired) {}
			
			@Override
			public void setEndOfBatch(boolean endOfBatch) {	}
			
			@Override
			public boolean isIncludeLocation() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isEndOfBatch() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public long getTimeMillis() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public ThrowableProxy getThrownProxy() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Throwable getThrown() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getThreadPriority() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getThreadName() {
				// TODO Auto-generated method stub
				return threadName;
			}
			
			@Override
			public long getThreadId() {
				// TODO Auto-generated method stub
				return threadId;
			}
			
			@Override
			public StackTraceElement getSource() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getNanoTime() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Message getMessage() {
				// TODO Auto-generated method stub
				return new Message() {
					
					@Override
					public Throwable getThrowable() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Object[] getParameters() {
						// TODO Auto-generated method stub
						return parameters;
					}
					
					@Override
					public String getFormattedMessage() {
						// TODO Auto-generated method stub
						return message;
					}
					
					@Override
					public String getFormat() {
						// TODO Auto-generated method stub
						return null;
					}
				};
			}
			
			@Override
			public Marker getMarker() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getLoggerName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getLoggerFqcn() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Level getLevel() {
				return level;
			}
			
			@Override
			public Instant getInstant() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ContextStack getContextStack() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Map<String, String> getContextMap() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ReadOnlyStringMap getContextData() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

}
