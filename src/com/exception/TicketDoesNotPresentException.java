package com.exception;

public class TicketDoesNotPresentException extends Exception {
	private static final long serialVersionUID = 1L;
	public TicketDoesNotPresentException(String string) {
		super(string);
	}

}
