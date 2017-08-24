package bcccp.carpark.paystation;

import bcccp.carpark.ICarpark;
import bcccp.tickets.adhoc.IAdhocTicket;

public class PaystationController 
		implements IPaystationController {
	
	private IPaystationUI ui;	
	private ICarpark carpark;

	private IAdhocTicket  adhocTicket = null;
	private float charge;
	
	

	public PaystationController(ICarpark carpark, IPaystationUI ui) {
		//TODO Implement constructor
		this.carpark = carpark;
		this.ui=  ui;
	}



	@Override
	public void ticketInserted(String barcode) {
		// TODO Auto-generated method stub
		System.out.printf("ticket inserted");
		
	}



	@Override
	public void ticketPaid() {
		// TODO Auto-generated method stub
		System.out.printf("ticket paid");
		
		
	}



	@Override
	public void ticketTaken() {
		// TODO Auto-generated method stub
		System.out.printf("ticket Taken");
		
		
	}

	
	
}
