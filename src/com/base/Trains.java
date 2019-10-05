package com.base;

import java.util.ArrayList;

public class Trains {
	private int trainNo;
	private String startStation;
	private String destinationStation;
	private ArrayList<Ticket> ticketsInTrain;
	
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
	public ArrayList<Ticket> getTicketsInTrain() {
		return ticketsInTrain;
	}
	public void setTicketsInTrain(ArrayList<Ticket> ticketsInTrain) {
		this.ticketsInTrain = ticketsInTrain;
	}
	
	public Trains(int trainNo, String startStation, String destinationStation) {
		super();
		this.trainNo = trainNo;
		this.startStation = startStation;
		this.destinationStation = destinationStation;
		ticketsInTrain=new ArrayList<Ticket>();
	}
	public Trains() {
		super();
		ticketsInTrain=new ArrayList<Ticket>();
	}
}
