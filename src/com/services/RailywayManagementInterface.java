package com.services;

import java.util.ArrayList;
import java.util.HashMap;

import com.base.Passenger;
import com.base.Ticket;
import com.exception.InvalidTrainException;
import com.exception.LimitExceededException;
import com.exception.TicketAlreadyExistException;
import com.exception.TicketDoesNotPresentException;

public interface RailywayManagementInterface {
	boolean issueTicket(int trainNo, Ticket t) throws TicketAlreadyExistException, LimitExceededException, InvalidTrainException;
	
	HashMap<Integer,Integer> getCountOfSeniorCitizens();
	
	boolean cancelTicket(int trainNo,int ticketNo) throws TicketDoesNotPresentException, InvalidTrainException;
	
	ArrayList<Passenger> getPassengerListByGender(String gender);
}
