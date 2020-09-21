package com.aa.cqe.errorhandler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public enum ErrorCode {
	INTERNAL_SERVER_ERROR("500","Internal Server Error"),
	NOT_FOUND("400", "Record Not found"),
	RULES_NOT_FOUND_ERROR("1004", "No rule found error"),
	CERTIFICATE_NOT_FOUND("501", "Certificate Not found"),
	TOKEN_API_ERROR("","Token Manager API Throwing Error"),
	CCS_API_ERROR("","CCS API Throwing Error"),
	CONMTH_API_ERROR("", "Contract Months API Throwing Error"),
	PUBLISHING_ERROR("300","Event Hub Publishing Error"),
	EMPTY_EVENT_ERROR("", "Empty Event Error");
	@Setter @Getter
	private String code, message;
}
