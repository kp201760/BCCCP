package bcccp.tickets.adhoc;

import java.util.Date;

public class AdhocTicket implements IAdhocTicket {
	
	private String carparkId;
	private int ticketNo;
	private long entryDateTime;
	private long paidDateTime;
	private long exitDateTime;
	private float charge;
	private String barcode;

	
	// default constructor
	public AdhocTicket(){
	  
	}

	
	public AdhocTicket(String carparkId, int ticketNo, String barcode) {
		//TDO Implement constructor
		this.carparkId=carparkId;
		this.ticketNo=ticketNo;
		this.barcode=barcode;
	}


	@Override
	public int getTicketNo() {
		// TODO Auto-generated method stub
		return ticketNo;
	}

	public int setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}


	@Override
	public String getBarcode() {
		// TODO Auto-generated method stub
		return barcode;
	}

	public String setBarcode(String barcode) {
		this.barcode = barcode;
	}


	@Override
	public String getCarparkId() {
		// TODO Auto-generated method stub
		return carparkId;
	}

	public String setCarparkId(String carparkId) {
		this.carparkId = carparkId;
	}


	@Override
	public void enter(long dateTime) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public long getEntryDateTime() {
		// TODO Auto-generated method stub
		return entryDateTime;
	}

	public long setEntryDateTime(long entryDateTime ) {
		this.entryDateTime = entryDateTime;
	}


	@Override
	public boolean isCurrent() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void pay(long dateTime, float charge) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public long getPaidDateTime() {
		// TODO Auto-generated method stub
		return paidDateTime;
	}

	public long setPaidDateTime(long paidDateTime) {
		this.paidDateTime = paidDateTime;
	}


	@Override
	public boolean isPaid() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public float getCharge() {
		// TODO Auto-generated method stub
		return charge;
	}

	public float setCharge(float charge) {
		this.charge = charge;
	}


	@Override
	public void exit(long dateTime) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public long getExitDateTime() {
		// TODO Auto-generated method stub
		return exitDateTime;
	}

	public long setExitDateTime(long exitDateTime) {
		this.exitDateTime = exitDateTime;
	}


	@Override
	public boolean hasExited() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
