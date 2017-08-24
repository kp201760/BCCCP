package bcccp.tickets.adhoc;

import java.util.List;

public class AdhocTicketDAO  implements IAdhocTicketDAO  {

	private IAdhocTicketFactory factory;
	private int currentTicketNo;

	
	
	public AdhocTicketDAO(IAdhocTicketFactory factory, int currentTicketNo) {
		//TODO Implement constructor
		this.factory = factory;
		this.currentTicketNo = currentTicketNo;
	}



	@Override
	public IAdhocTicket createTicket(String carparkId) {
		// TODO Auto-generated method stub
		return ticket;
	}



	@Override
	public IAdhocTicket findTicketByBarcode(String barcode) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<IAdhocTicket> getCurrentTickets() {
		// TODO Auto-generated method stub
		return currentTicketNo;
	}

	
	
}
