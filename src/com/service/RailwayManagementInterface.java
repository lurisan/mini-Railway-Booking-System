package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import com.base.Ticket;
import com.base.Passenger;
import com.exception.LimitExceededException;
import com.exception.TicketAlreadyExistException;

public interface RailwayManagementInterface {
	boolean issueTicket(int trainNo, Ticket T) throws TicketAlreadyExistException, LimitExceededException;
	HashMap<Integer,Integer> getCountOfSeniorCitizens();
	boolean cancelTicket(int trainNo, int ticketNo);
	ArrayList<Passenger> getPassengersByGender(String gender);
}
