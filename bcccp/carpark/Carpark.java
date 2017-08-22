package bcccp.carpark;

import java.util.List;

import bcccp.tickets.adhoc.IAdhocTicket;
import bcccp.tickets.adhoc.IAdhocTicketDAO;
import bcccp.tickets.season.ISeasonTicket;
import bcccp.tickets.season.ISeasonTicketDAO;

public class Carpark implements ICarpark {
	
	private List<ICarparkObserver> observers;
	private String carparkId;
	private int capacity;
	private int numberOfCarsParked;
	private IAdhocTicketDAO adhocTicketDAO;
	private ISeasonTicketDAO seasonTicketDAO;
	
	
	
	public Carpark(String name, int capacity, 
			IAdhocTicketDAO adhocTicketDAO, 
			ISeasonTicketDAO seasonTicketDAO) {
		//Constructor
		this.name=name;
		this.capacity=capacity;
		this.adhocTicketDAO=adhocTicketDAO;
		this.seasonTicketDAO=seasonTicketDAO0;		
	}



	@Override
	public void register(ICarparkObserver observer) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deregister(ICarparkObserver observer) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}



	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if (numberOfCarsParked==capacity)
		{
			return true;	
		}
		else  
		{
			return false;
		}
	}



	@Override
	public IAdhocTicket issueAdhocTicket() {
		// TODO Auto-generated method stub
		return ;
	}



	@Override
	public void recordAdhocTicketEntry() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public IAdhocTicket getAdhocTicket(String barcode) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public float calculateAddHocTicketCharge(long entryDateTime) {
		// TODO Auto-generated method stub
		return ;
	}



	@Override
	public void recordAdhocTicketExit() {
		// TODO Auto-generated method stub
		int num=observers.length;
        while(iter.hasMoreElements())
        {
            for( int I=0;I<num;I++)
                observers[I].update( this, iter.nextElement() );    
        }
		
	}



	@Override
	public void registerSeasonTicket(ISeasonTicket seasonTicket) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deregisterSeasonTicket(ISeasonTicket seasonTicket) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public boolean isSeasonTicketValid(String ticketId) {
		// TODO Auto-generated method stub
		if( observers.getId==ticketId)
		{
			return true;
		}
		else
		{
			return false;
		}
	}



	@Override
	public boolean isSeasonTicketInUse(String ticketId) {
		// TODO Auto-generated method stub
		if(inUse(ticketId)==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}



	@Override
	public void recordSeasonTicketEntry(String ticketId) {
		// TODO Auto-generated method stub
		int num=observers.length;
        while(iter.hasMoreElements())
        {
            for( int i=0;i<num;i++){
				if(observers[i]==ticketId)
				{
					long entry=observers[i].getStartTime();
				}	
			}				
        }
		System.out.println("Entry time of ticket ID "+ ticketId+" is "+entry);
	}



	@Override
	public void recordSeasonTicketExit(String ticketId) {
		// TODO Auto-generated method stub
		int num=observers.length;
        while(iter.hasMoreElements())
        {
            for( int i=0;i<num;i++){
				if(observers[i]==ticketId)
				{
					long exit=observers[i].getEndTime();
				}	
			}				
        }
		System.out.println("Exit time of ticket ID "+ ticketId+" is "+exit);
	}

	
	

}
