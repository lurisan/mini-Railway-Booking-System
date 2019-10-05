package com.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.base.Passenger;
import com.base.Ticket;
import com.base.Train;
import com.exception.LimitExceededException;
import com.exception.TicketAlreadyExistException;

public class RailwayTicketManagement implements RailwayManagementInterface {
	
	ArrayList<Train> trains;
	
	@Override
	public boolean issueTicket(int trainNo, Ticket ticket) throws TicketAlreadyExistException, LimitExceededException {
		for(Train t:trains)
			if(trainNo==t.getTrainNo())
			{
				if(t.getTickets().size()<500)
				{
					for(Ticket tt:t.getTickets())
						if(tt.getTicketNo()==ticket.getTicketNo())
							throw new TicketAlreadyExistException("Ticket is existing in the train !!!");
						else
						{
							t.getTickets().add(ticket);
							return true;
						}
				}
				else
					throw new LimitExceededException("Train is Full !!!");
			}
		return false;
	}

	@Override
	public HashMap<Integer, Integer> getCountOfSeniorCitizens() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cancelTicket(int trainNo, int ticketNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Passenger> getPassengersByGender(String gender) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
