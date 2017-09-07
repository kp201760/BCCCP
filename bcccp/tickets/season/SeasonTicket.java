package bcccp.tickets.season;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeasonTicket implements ISeasonTicket {
	
	private List<IUsageRecord> usages;
	private IUsageRecord currentUsage = null;
	
	private String ticketId;
	private String carparkId;
	private long startValidPeriod;
	private long endValidPeriod;
	
	public SeasonTicket (String ticketId, 
			             String carparkId, 
			             long startValidPeriod,
			             long endValidPeriod) {
		//TDO Implement constructor
		this.ticketId = ticketId;
		this.carparkId =carparkId;
		this.startValidPeriod = startValidPeriod;
		this.endValidPeriod = endValidPeriod;
		
		usages = new ArrayList<IUsageRecord>();
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return ticketId;
	}

	@Override
	public String getCarparkId() {
		// TODO Auto-generated method stub
		return carparkId;
	}

	@Override
	public long getStartValidPeriod() {
		// TODO Auto-generated method stub
		return startValidPeriod;
	}

	@Override
	public long getEndValidPeriod() {
		// TODO Auto-generated method stub
		return endValidPeriod;
	}

	@Override
	public boolean inUse() {
		// TODO Auto-generated method stub
		return currentUsage != null;
	}

	@Override
	public void recordUsage(IUsageRecord record) {
		// TODO Auto-generated method stub
		currentUsage = record;
		if (!usages.contains(record) ) {
			usages.add(record);
		}
		
		
	}

	@Override
	public IUsageRecord getCurrentUsageRecord() {
		// TODO Auto-generated method stub
		return currentUsage;
	}

	@Override
	public void endUsage(long dateTime) {
		// TODO Auto-generated method stub
		if (currentUsage == null) throw new RuntimeException("SeasonTicket.endUsage : ticket is not in use");
		
		currentUsage.finalise(dateTime);
		currentUsage = null;
	}

	@Override
	public List<IUsageRecord> getUsageRecords() {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		builder.append("Carpark    : " + carparkId + "\n" +
		       "Ticket No  : " + ticketId + "\n" );
		for (IUsageRecord usage : usages) {
			builder.append(usage.toString() + "\n");
		}
		return builder.toString();
	}

	}



