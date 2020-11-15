package com.banking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BankingException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Throwable errorCause;
	private String errorCode;

	public Throwable getErrorCause() {
		return errorCause;
	}

	public void setErrorCause(Throwable errorCause) {
		this.errorCause = errorCause;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public BankingException(String message) {
		super(message);
	}

	public BankingException(String message, Throwable cause) {
		super(message);
		this.errorCause = cause;
	}

	public BankingException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
}
