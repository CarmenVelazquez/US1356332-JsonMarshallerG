package com.aa.cqe.faqla.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"rule",
"result",
"messages",
"messageObjects",
})

@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleResults {
	
	@JsonProperty("rule")
	private String rule;
	
	@JsonProperty("result")
	private String result;
	
	@JsonProperty("messages")
	private List<String> messages;
	
	@JsonProperty("messageObjects")
	private MessageObjects messageObjects;
	
	@JsonProperty("messageObjects")
	public MessageObjects getMessageObjects() {
		return messageObjects;
	}

	@JsonProperty("messageObjects")
	public void setMessageObjects(MessageObjects messageObjects) {
		this.messageObjects = messageObjects;
	}

	@JsonProperty("rule")
	public String getRule() {
		return rule;
	}
	
	@JsonProperty("rule")
	public void setRule(String rule) {
		this.rule = rule;
	}
	
	@JsonProperty("result")
	public String getResult() {
		return result;
	}
	
	@JsonProperty("result")
	public void setResult(String result) {
		this.result = result;
	}
	
	@JsonProperty("messages")
	public List<String> getMessages() {
		return messages;
	}
	
	@JsonProperty("messages")
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	
	

}
