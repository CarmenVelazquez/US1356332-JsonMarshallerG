package com.aa.cqe.logging;


public class MessageBuilder extends LogElementsBuilder{
	 public MessageBuilder(LogElements logElements) {
		 this.logElements = logElements;
	 }
	 public MessageBuilder msg(Message msg) {
		 logElements.setMsgs(msg);
		 return this;
	 }
}