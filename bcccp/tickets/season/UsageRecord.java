package bcccp.tickets.season;

public class UsageRecord implements IUsageRecord {
	
	String ticketId;
	long startDateTime;
	long endDateTime;
	
	
	
	public UsageRecord(String ticketId, long startDateTime, long endDateTime) {
		//TODO Implement constructor
		this.ticketId = ticketId;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
	}



	@Override
	public void finalise(long endDateTime) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public long getStartTime() {
		// TODO Auto-generated method stub
		return startDateTime;
	}



	@Override
	public long getEndTime() {
		// TODO Auto-generated method stub
		return getEndTime;
	}



	@Override
	public String getSeasonTicketId() {
		// TODO Auto-generated method stub
		return ticketId;;
	}
	
	
	
}
