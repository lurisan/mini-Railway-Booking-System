package com.exception;

public class TicketAlreadyExistException extends Exception {
	private static final long serialVersionUID = 1L;
	public TicketAlreadyExistException(String message) {
		super(message);
	}

}
