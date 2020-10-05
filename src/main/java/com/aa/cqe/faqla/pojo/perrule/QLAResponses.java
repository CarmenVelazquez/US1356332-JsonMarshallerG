package com.aa.cqe.faqla.pojo.perrule;

import com.aa.cqe.faqla.pojo.RuleResults;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"requestId",
"valid",
"isLegal",
"isContractual",
"isQualified",
"ruleResults"
})

@JsonIgnoreProperties(ignoreUnknown = true)
public class QLAResponses {

	
	@JsonProperty("requestId")
	private String requestId;
	
	@JsonProperty("valid")
	private boolean valid;
	
	@JsonProperty("isLegal")
	private boolean isLegal;
	
	@JsonProperty("isContractual")
	private boolean isContractual;
	
	@JsonProperty("isQualified")
	private boolean isQualified;
	
	@JsonProperty("requestId")
	public String getRequestId() {
		return requestId;
	}

	@JsonProperty("requestId")
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@JsonProperty("valid")
	public boolean isValid() {
		return valid;
	}

	@JsonProperty("valid")
	public void setValid(boolean valid) {
		this.valid = valid;
	}

	@JsonProperty("isLegal")
	public boolean isLegal() {
		return isLegal;
	}

	@JsonProperty("isLegal")
	public void setLegal(boolean isLegal) {
		this.isLegal = isLegal;
	}

	@JsonProperty("isContractual")
	public boolean isContractual() {
		return isContractual;
	}

	@JsonProperty("isContractual")
	public void setContractual(boolean isContractual) {
		this.isContractual = isContractual;
	}

	@JsonProperty("isQualified")
	public boolean isQualified() {
		return isQualified;
	}

	@JsonProperty("isQualified")
	public void setQualified(boolean isQualified) {
		this.isQualified = isQualified;
	}
	@JsonProperty("ruleResults")
	private RuleResults ruleResults;
	@JsonProperty("ruleResults")
	public RuleResults getRuleResults() {
		return ruleResults;
	}

	@JsonProperty("ruleResults")
	public void setRuleResults(RuleResults ruleResults) {
		this.ruleResults = ruleResults;
	}


}
