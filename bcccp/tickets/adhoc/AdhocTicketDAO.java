package bcccp.tickets.adhoc;

import java.util.List;

public class AdhocTicketDAO  implements IAdhocTicketDAO  {

	private IAdhocTicketFactory factory;
	private int currentTicketNo;


	// default constructor
	public AdhocTicketDAO(){
	  
	}
	
	public AdhocTicketDAO(IAdhocTicketFactory factory) {
		//TODO Implement constructor
		this.factory=factory;
	}



	@Override
	public IAdhocTicket createTicket(String carparkId) {
		// TODO Auto-generated method stub
		return carparkId;
	}



	@Override
	public IAdhocTicket findTicketByBarcode(String barcode) {
		// TODO Auto-generated method stub
		return barcode;
	}



	@Override
	public List<IAdhocTicket> getCurrentTickets() {
		// TODO Auto-generated method stub
		return currentTicketNo;
	}

	
	
}
