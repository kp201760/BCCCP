package bcccp.tickets.adhoc;

public class AdhocTicketFactory implements IAdhocTicketFactory {

	// default constructor
	public AdhocTicketFactory(){
	  
	}


	@Override
	public IAdhocTicket make(String carparkId, int ticketNo) {
		// TODO Auto-generated method stub
		return carparkId,ticketNo ;
	}


}
