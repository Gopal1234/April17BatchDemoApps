package model;

import java.util.Date;

public class Flight   {
	//sort based price low to high
	//sort based on date
	//using comparator interface
	private String flightId;
	private String flightType;
	private boolean flightStatus;
	private String source;
	private String destination;
	private double flightPrice;
	private Date flyingDate;
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getFlightType() {
		return flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}
	public boolean isFlightStatus() {
		return flightStatus;
	}
	public void setFlightStatus(boolean flightStatus) {
		this.flightStatus = flightStatus;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getFlightPrice() {
		return flightPrice;
	}
	public void setFlightPrice(double flightPrice) {
		this.flightPrice = flightPrice;
	}
	public Date getFlyingDate() {
		return flyingDate;
	}
	public void setFlyingDate(Date flyingDate) {
		this.flyingDate = flyingDate;
	}
	/*@Override
	public int compareTo(Flight f) {
		
		Date d1=f.getFlyingDate();
		Date d2=this.getFlyingDate();
	
		if(d1.after(d2))
		{
			return 1;
		}
		return -1;
	}*/
	
	
	
	
	
	
	
	

}
