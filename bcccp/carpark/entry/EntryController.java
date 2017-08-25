package bcccp.carpark.entry;

import bcccp.carpark.Carpark;
import bcccp.carpark.ICarSensor;
import bcccp.carpark.ICarSensorResponder;
import bcccp.carpark.ICarpark;
import bcccp.carpark.ICarparkObserver;
import bcccp.carpark.IGate;
import bcccp.tickets.adhoc.IAdhocTicket;

public class EntryController 
		implements ICarSensorResponder,
				   ICarparkObserver,
		           IEntryController {
	
	private IGate entryGate;
	private ICarSensor outsideSensor; 
	private ICarSensor insideSensor;
	private IEntryUI ui;
	
	private ICarpark carpark;
	private IAdhocTicket  adhocTicket = null;
	private long entryTime;
	private String seasonTicketId = null;
	
	

	public EntryController(Carpark carpark, IGate entryGate, 
			ICarSensor os, 
			ICarSensor is,
			IEntryUI ui) {
		//TODO Implement constructor
		this.carpark=carpark;
		this.entryGate=entryGate;
		this.os=os;
		this.is=is;
		this.ui=ui;
	}



	@Override
	public void buttonPushed() {
		// TODO Auto-generated method stub
		System.out.println("Please pushed the button to proceed.");
		
	}



	@Override
	public void ticketInserted(String barcode) {
		// TODO Auto-generated method stub
		System.println.out("Enter the ticket to read the barcode");
		int num=observers.length;
        while(iter.hasMoreElements())
        {
            for( int i=0;i<num;i++){
				if(barcode==observers[i])
				{
					System.out.println("Ticket is accepted");
				}
				else
				{
					System.out.println("Ticket is rejected");
				}
			}
		}
		
	}



	@Override
	public void ticketTaken() {
		// TODO Auto-generated method stub
		System.out.println("Please collect your ticket.");
	}



	@Override
	public void notifyCarparkEvent() {
		// TODO Auto-generated method stub
		observers.notify();
	}



	@Override
	public void carEventDetected(String detectorId, boolean detected) {
		// TODO Auto-generated method stub
		if(detected==true){
			observers.addObserve(detectorId);
			notifyobservers();
		}		
	}

	
	
}
