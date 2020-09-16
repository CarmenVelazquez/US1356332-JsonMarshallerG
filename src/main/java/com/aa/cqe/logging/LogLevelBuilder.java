package com.aa.cqe.logging;

public class LogLevelBuilder extends LogElementsBuilder{
	 public LogLevelBuilder(LogElements logElements) {
		 this.logElements = logElements;
	 }
	 public LogLevelBuilder logLevel(String level) {
		 logElements.setLevel(level);
		 return this;
	 }
	 public LogLevelBuilder threadName(String threadName) {
		 logElements.setThreadName(threadName);
		 return this;
	 }
	 public LogLevelBuilder className(String className) {
		 logElements.setClassName(className);
		 return this;
	 }
}
