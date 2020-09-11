package com.aa.cqe.errorhandler;

import java.util.List;

import com.google.gson.Gson;

import lombok.Data;

@Data
public class ErrorDetails {
	ErrorCode code;
	Throwable cause;
	String severity;
	String mesage;
	List<StackTraceElement> stackTrace;
	
	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
		
}
