package com.base;

public class Ticket {
	private int ticketNo;
	private double ticketPrice;
	SeniorCitizen s;
	
	public SeniorCitizen getS() {
		return s;
	}

	public void setS(SeniorCitizen s) {
		this.s = s;
	}
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	public Ticket(int ticketNo, double ticketPrice, Passenger s) {
		super();
		this.ticketNo = ticketNo;
		this.ticketPrice = ticketPrice;
		this.s=new SeniorCitizen(s.getPassengerName(), s.getGender(), s.getSource(), s.getDestination(),0);
	}
	
	public Ticket(int ticketNo, double ticketPrice, SeniorCitizen s) {
		super();
		this.ticketNo = ticketNo;
		this.ticketPrice = ticketPrice;
		this.s=new SeniorCitizen(s.getPassengerName(), s.getGender(), s.getSource(), s.getDestination(),s.getAge());
	}
	public Ticket() {
		super();
	}
}
