package com.base;

import java.util.ArrayList;

public class Train {
	private int trainNo;
	private String startStation;
	private String destinationStation;
	private ArrayList<Ticket> tickets;
	
	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Train(int trainNo, String startStation, String destinationStation) {
		super();
		this.trainNo = trainNo;
		this.startStation = startStation;
		this.destinationStation = destinationStation;
		tickets=new ArrayList<Ticket>();
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getStartStation() {
		return startStation;
	}

	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}
}