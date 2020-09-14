package com.aa.cqe.errorhandler;

import java.text.MessageFormat;

import com.aa.cqe.errorhandler.ErrorCode;


public class CustomizeRunTimeException extends RuntimeException{
	private static final long serialVersionUID = 1304019544672378562L;
	
	 private final ErrorCode code;
	 public CustomizeRunTimeException(ErrorCode code) {
	        super();
	        this.code = code;
	    }
	    public CustomizeRunTimeException(String message, Throwable cause, ErrorCode code) {
	        super(message+", " + code, cause);
	        this.code = code;
	    }
	    public CustomizeRunTimeException(String message, ErrorCode code) {
	        super(MessageFormat.format("{0}, {1} because {2} ",code.getCode(),code.getMessage(),message));
	        this.code = code;
	    }
	    public CustomizeRunTimeException(Throwable cause, ErrorCode code) {
	        super(code.toString(), cause);
	        this.code = code;
	    }
	    public ErrorCode getCode() {
	        return this.code;
	    }
	    
	    
}
