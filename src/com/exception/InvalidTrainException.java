package com.exception;

public class InvalidTrainException extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidTrainException(String string) {
		super(string);
	}
}
