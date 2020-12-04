package com.aa.cqe.logging;


import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.ThreadContext.ContextStack;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.impl.ThrowableProxy;
import org.apache.logging.log4j.core.time.Instant;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.util.ReadOnlyStringMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.lang.Nullable;

public class JsonEventLayoutTest {
	private JSONEventLayout jsonEventLayout;
	private String exampleRequest;
	Logger log;
	@BeforeEach
	public void setUp() {
		System.setProperty("log4j.configurationFile",JsonEventLayoutTest.class.getClassLoader().getResourceAsStream("log4j2.yml").toString());
        log = LogManager.getLogger();
        Charset chset = null;
        chset.defaultCharset();
        jsonEventLayout = new JSONEventLayout(true, chset);
	}
	
	
	@Test
	public void logSerialize() throws InterruptedException, IOException {
		int numberOfThreads = 15;
	    ExecutorService service = Executors.newFixedThreadPool(10);
		CountDownLatch latch = new CountDownLatch(numberOfThreads);
		String[] eventArr = {"in","out","cancel","cargo","connection","continuation",
				 "create","delaymsg","desk","diversion","eqsub","loadplan","psgrload",
				 "rtd","stubsta"};
	    for (int i = 0; i < numberOfThreads; i++) {
	    	
	    	exampleRequest = FileUtils.readFileToString(new File("./src/test/resources/example/flight/"+ eventArr[i]+".json"), StandardCharsets.UTF_8);
	    	Thread.sleep(200);
	        service.submit(() -> {
	                try {
	                	
	            		String[] params = new String[] {"filter:SRE,SECURITY", "event","trackingID"};
	            		String fmtMessage = jsonEventLayout.toSerializable(getEvent(Thread.currentThread().getName(),Thread.currentThread().getId(),Level.INFO,exampleRequest, params));
	            		System.out.println("Serialize :"+ fmtMessage);
						
					} catch (IllegalStateException e) {
						e.printStackTrace();
					}
	            latch.countDown();
	        });      

	    }
	    latch.await();
	}

	
	private LogEvent getEvent(String threadName, long threadId, Level level, String message, @Nullable Object[] parameters) {
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
