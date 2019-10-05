package com.services;

import java.util.ArrayList;
import java.util.HashMap;

import com.base.Passenger;
import com.base.Ticket;
import com.base.Trains;
import com.exception.InvalidTrainException;
import com.exception.LimitExceededException;
import com.exception.TicketAlreadyExistException;
import com.exception.TicketDoesNotPresentException;

public class RailywayManagementSysytem implements RailywayManagementInterface {
	private ArrayList<Trains> trainList;
	
	public RailywayManagementSysytem() {
		super();
		trainList = new ArrayList<Trains>();
	}
	
	public ArrayList<Trains> getTrainList() {
		return trainList;
	}

	public void setTrainList(ArrayList<Trains> trainList) {
		this.trainList = trainList;
	}
	
	@Override
	public boolean issueTicket(int trainNo, Ticket t)
			throws TicketAlreadyExistException, LimitExceededException, InvalidTrainException {
		for(Trains tt:trainList)
			if(tt.getTrainNo()==trainNo)
				{
					if(tt.getTicketsInTrain().size()>=500)
						throw new LimitExceededException("Train is full !!!");
					else
					{
						for(Ticket exists:tt.getTicketsInTrain())
							if(exists.getTicketNo()==t.getTicketNo())
								throw new TicketAlreadyExistException("This ticket number is already booked on this train !!!");
						tt.getTicketsInTrain().add(t);
						return true;
					}
				}
			else
				throw new InvalidTrainException("Train does not exist !!!");
		return false;
	}
	
	@Override
	public boolean cancelTicket(int trainNo, int ticketNo)
			throws TicketDoesNotPresentException, InvalidTrainException{
		for(Trains tt:trainList)
			if(tt.getTrainNo()==trainNo)
				{
					for(Ticket t:tt.getTicketsInTrain())
						if(t.getTicketNo()==ticketNo)
						{
							tt.getTicketsInTrain().remove(t);
							return true;
						} 
					throw new TicketDoesNotPresentException("Ticket does not exist !!!");
				}
			else
				throw new InvalidTrainException("Train does not exist !!!");
		return false;
	}

	@Override
	public HashMap<Integer, Integer> getCountOfSeniorCitizens(){
		HashMap<Integer, Integer> hsm=new HashMap<Integer,Integer>();
		for(Trains train:trainList)
		{
			int count=0;
			for(Ticket ticket:train.getTicketsInTrain())
				if(ticket.getS().getAge()>=60)
					count++;
				else
					continue;
			hsm.put(train.getTrainNo(),count);
		}
		return hsm;
	}

	@Override
	public ArrayList<Passenger> getPassengerListByGender(String gender) {
		ArrayList<Passenger> list=new ArrayList<Passenger>();
		for(Trains t:trainList)
			for(Ticket tt:t.getTicketsInTrain())
				if(tt.getS().getGender()==gender)
					list.add(tt.getS());
		return list;
	}	
}
