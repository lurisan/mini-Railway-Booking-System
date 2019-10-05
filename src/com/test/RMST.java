package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.base.Passenger;
import com.base.SeniorCitizen;
import com.base.Ticket;
import com.base.Trains;
import com.exception.InvalidTrainException;
import com.exception.LimitExceededException;
import com.exception.TicketAlreadyExistException;
import com.exception.TicketDoesNotPresentException;
import com.services.RailywayManagementSysytem;

public class RMST {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Integer> hsm=new HashMap<Integer, Integer>();
		Ticket t1=new Ticket(0, 100, new SeniorCitizen("nasirul", "m", "source1", "destination1", 70));
		Ticket t2=new Ticket(1, 100, new Passenger("nasirul1", "m", "source2", "destination2"));
		Ticket t3=new Ticket(2, 100, new SeniorCitizen("nasirul2", "m", "source3", "destination3", 60));
		Ticket t4=new Ticket(3, 100, new Passenger("nasirul3", "m", "source4", "destination4"));
		
		Trains train=new Trains(1, "source1", "destination1");
		ArrayList<Trains> trainList=new ArrayList<Trains>();
		trainList.add(train);
		
		RailywayManagementSysytem rms=new RailywayManagementSysytem();
		
		rms.setTrainList(trainList);
		try
		{
			rms.issueTicket(1, t1);
			rms.issueTicket(1, t2);
			rms.issueTicket(1, t3);
			rms.issueTicket(1, t4);
			rms.cancelTicket(1, 0);
			rms.issueTicket(1, t1);
			System.out.println("cancelled");
			//rms.cancelTicket(1, 0);
			
			hsm=rms.getCountOfSeniorCitizens();
			
			for(Map.Entry<Integer, Integer> entry:hsm.entrySet())
				System.out.println(entry.toString());
			
			ArrayList<Passenger> arr=new ArrayList<Passenger>();
			arr.addAll((rms.getPassengerListByGender("f")));
			
			for(Passenger pass:arr)
				System.out.println(pass.toString());
		}
		catch(TicketAlreadyExistException e)
		{
			System.out.println(e.getMessage());
		}
		catch(LimitExceededException l)
		{
			System.out.println(l.getMessage());
		}
		catch (TicketDoesNotPresentException e)
		{
			System.out.println(e.getMessage());
		}
		catch (InvalidTrainException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
